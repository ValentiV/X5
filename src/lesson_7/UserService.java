package lesson_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService implements AccountService {
    private final ArrayList<Account> accounts = new ArrayList<>();

    public UserService(String file) throws IOException {
        File f = new File(file);
        if (!f.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
            for (int i = 1; i <= 10; i++) {
                String info = i + ";" + "ФИО_" + i + ";" + (int) (Math.random() * 10000);
                writer.write(info);
                writer.newLine();
            }
            writer.close();
        }

        BufferedReader reader = new BufferedReader(new FileReader(f));
        String bufLine;

        while ((bufLine = reader.readLine()) != null) {
            String[] accountInfo = bufLine.split("\n");
            for (String line : accountInfo) {
                String[] accountSubInfo = line.split(";");
                this.accounts.add(new Account(Integer.parseInt(accountSubInfo[0]), accountSubInfo[1],
                        Integer.parseInt(accountSubInfo[2])));
            }
        }
    }
/*
    public ArrayList<Account> getAccount() {
        return this.accounts;
    }*/

    //Проверяем существование id счета
    public boolean checkAccountId(int accountId) {
        for (Account account : this.accounts) {
            if (account.getId() == accountId) {
                return false;
            }
        }
        return true;
    }

    //Проверяем остатка средств на счете
    public double checkAmount(int accountId) {
        double balance = 0;
        for (Account account : this.accounts) {
            if (account.getId() == accountId) {
                balance = account.getAmount();
            }
        }
        return balance;
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        if (checkAccountId(accountId)) {
            throw new UnknownAccountException("Номер счета не найден!");
        } else {
            for (Account account : this.accounts) {
                if (account.getId() == accountId) {
                    System.out.println("Баланс клиента " + account.getHolder() + ": " + account.getAmount());
                }
            }
        }
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (checkAccountId(accountId) || checkAmount(accountId) - amount < 0) {
            if (checkAccountId(accountId)) {
                throw new UnknownAccountException("Номер счета не найден!");
            } else {

                throw new NotEnoughMoneyException("Не достаточно средств на счете!");
            }
        } else {
            for (Account account : accounts) {
                if (account.getId() == accountId) {
                    account.setAmount(account.getAmount() - amount);
                    System.out.println("Текущий баланс: " + account.getHolder() + " :" + account.getAmount());
                    account.setAmount(account.getAmount() - amount);
                    System.out.println("Обновленный баланс: " + account.getHolder() + " :" + account.getAmount());
                }
            }
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (checkAccountId(accountId) || amount <= 0) {
            if (checkAccountId(accountId)) {
                throw new UnknownAccountException("Номер счета не найден!");
            } else {
                throw new NotEnoughMoneyException("Сумма пополнения должна быть больше 0!");
            }
        } else {
            for (Account account : accounts) {
                if (account.getId() == accountId) {
                    System.out.println("Текущий баланс: " + account.getHolder() + " :" + account.getAmount());
                    account.setAmount(account.getAmount() + amount);
                    System.out.println("Обновленный баланс: " + account.getHolder() + " :" + account.getAmount());
                }
            }
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws Throwable {
        withdraw(from, amount);
        deposit(to, amount);
    }

    public void chooseOperation() throws Throwable {
        int accountId, amount;
        Scanner reader = new Scanner(System.in);
        System.out.println("Укажите операцию:");
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
                withdraw(accountId, amount);
            }
            case "deposit" -> {
                System.out.println("Укажите номер счета:");
                accountId = reader.nextInt();
                System.out.println("Укажите сумму для пополнения:");
                amount = reader.nextInt();
                deposit(accountId, amount);
            }
            case "transfer" -> {
                System.out.println("Укажите номер счета отправителя:");
                int accountIdFrom = reader.nextInt();
                System.out.println("Укажите номер счета получателя:");
                int accountIdTo = reader.nextInt();
                System.out.println("Укажите сумму перевода:");
                amount = reader.nextInt();
                transfer(accountIdFrom, accountIdTo, amount);
            }
            default -> System.out.println("Операция не поддерживается!");
        }
    }
}