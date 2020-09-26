package lesson_8;

import java.sql.*;

public class Main {

    public static final String SELECT = "SELECT * FROM ACCOUNTS";
    private static final String address =
            "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'\\;RUNSCRIPT FROM './accounts.sql'";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(address);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT);
            UserService accountService = new UserService(connection, resultSet);
            accountService.listAccounts();
            accountService.chooseOperation();
        } catch (SQLException | UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}