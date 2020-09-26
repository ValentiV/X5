package lesson_8;

import java.sql.*;
import java.util.Scanner;

public class UserService implements AccountService {

    private final Connection connection;
    private ResultSet resultSet;
    public static final String selectAll = "SELECT * FROM ACCOUNTS";
    public static String select = "SELECT * FROM ACCOUNTS where id = ?";
    public static String update = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";

    public UserService(Connection connection, ResultSet resultSet) {
        this.connection = connection;
        this.resultSet = resultSet;
    }

    public void listAccounts() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery(selectAll);
        while (resultSet.next()) {
            System.out.println("Номер счета: " + resultSet.getInt("id") + "; клиент: "
                    + resultSet.getString("holder") + "; сумма на счету: "
                    + resultSet.getInt("amount"));
        }
        statement.close();
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException, SQLException {
        ResultSet resultSet;
        PreparedStatement statement = connection.prepareStatement(select);
        statement.setInt(1, accountId);
        statement.execute();
        resultSet = statement.getResultSet();
        if (resultSet.next()) {
            System.out.println("Баланс клиента " + resultSet.getString("holder") +
                    ": " + resultSet.getInt("amount"));
        } else {
            throw new UnknownAccountException("Номер счета не найден!");
        }
        statement.close();
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        ResultSet resultSet;
        PreparedStatement statement = connection.prepareStatement(select);
        statement.setInt(1, accountId);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int accountAmount = resultSet.getInt("amount");
            if (accountAmount < amount) {
                throw new NotEnoughMoneyException("Недостаточно средств на счете!");
            } else {
                System.out.println("До снятия");
                balance(accountId);
                PreparedStatement statementUpdate = connection.prepareStatement(update);
                statementUpdate.setInt(1, accountAmount - amount);
                statementUpdate.setInt(2, accountId);
                statementUpdate.executeUpdate();
                statementUpdate.close();
            }
        } else {
            throw new UnknownAccountException("Номер счета не найден!");
        }
        System.out.println("После снятия");
        balance(accountId);
        statement.close();
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        ResultSet resultSet;
        PreparedStatement statement = connection.prepareStatement(select);
        statement.setInt(1, accountId);
        statement.execute();
        resultSet = statement.getResultSet();
        if (resultSet.next()) {
            if (amount == 0) {
                throw new NotEnoughMoneyException("Недостаточно средств на счете!");
            } else {
                System.out.println("До пополнения");
                balance(accountId);
                int accountAmount = resultSet.getInt("amount");
                PreparedStatement statementUpdate = connection.prepareStatement(update);
                statementUpdate.setInt(1, accountAmount + amount);
                statementUpdate.setInt(2, accountId);
                statementUpdate.execute();
                statementUpdate.close();
            }
        } else {
            throw new UnknownAccountException("Номер счета не найден!");
        }
        System.out.println("После пополнения");
        balance(accountId);
        statement.close();
    }

    @Override
    public void transfer(int fromId, int toId, int amount) throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        ResultSet resultSet;
        PreparedStatement statement = connection.prepareStatement(select);
        statement.setInt(1, toId);
        statement.execute();
        resultSet = statement.getResultSet();
        if (resultSet.next()) {
            withdraw(fromId, amount);
            deposit(toId, amount);
        } else {
            throw new UnknownAccountException("Номер счета получателя не найден!");
        }
        statement.close();
    }

    //Выбираем операцию
    public void chooseOperation() throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        int accountId, amount;
        Scanner reader = new Scanner(System.in);
        System.out.println("\nУкажите операцию:");
        String operation = reader.nextLine();
        switch (operation) {
            case "balance" -> {
                System.out.println("Укажите номер счета:");
                accountId = reader.nextInt();
                balance(accountId);
            }
            case "withdraw" -> {
                System.out.println("Укажите номер счета:");
                accountId = reader.nextInt();
                System.out.println("Укажите сумму для снятия:");
                amount = reader.nextInt();
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("Сумма должна быть больше 0!");
                }
                withdraw(accountId, amount);
            }
            case "deposit" -> {
                System.out.println("Укажите номер счета:");
                accountId = reader.nextInt();
                System.out.println("Укажите сумму для пополнения:");
                amount = reader.nextInt();
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("Сумма должна быть больше 0!");
                }
                deposit(accountId, amount);
            }
            case "transfer" -> {
                System.out.println("Укажите номер счета отправителя:");
                int accountIdFrom = reader.nextInt();
                System.out.println("Укажите номер счета получателя:");
                int accountIdTo = reader.nextInt();
                if (accountIdFrom == accountIdTo) {
                    throw new UnknownAccountException("Счет отправителя и счет получателя должны отличаться!");
                }
                System.out.println("Укажите сумму перевода:");
                amount = reader.nextInt();
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("Сумма перевода должна быть больше 0!");
                }
                transfer(accountIdFrom, accountIdTo, amount);
            }
            default -> System.out.println("Операция не поддерживается!");
        }
        connection.close();
    }
}