package lesson_7;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\X5\\lesson_7.txt");
        if (file.exists() && !file.isDirectory()) {
            System.out.println("Хранилище заполнено!");
        } else {
            System.out.println("Наполняем хранилище...");
            Account[] account = new Account[10];
            account[0] = new Account(1, "ФИО_1", 200000);
            account[1] = new Account(2, "ФИО_2", 123.4);
            account[2] = new Account(3, "ФИО_3", 12);
            account[3] = new Account(4, "ФИО_4", 23000);
            account[4] = new Account(5, "ФИО_5", 65000);
            account[5] = new Account(6, "ФИО_6", 88900);
            account[6] = new Account(7, "ФИО_7", 890.9);
            account[7] = new Account(8, "ФИО_8", 123456.78);
            account[8] = new Account(9, "ФИО_9", 1200000);
            account[9] = new Account(10, "ФИО_10", 0.99);

            try (final FileWriter writer = new FileWriter("C:\\X5\\lesson_7.txt")) {
                for (Account value : account) {
                    int id = value.getId();
                    String holder = value.getHolder();
                    double amount = value.getAmount();
                    writer.write(id + "; " + holder + "; " + amount);
                    writer.write(System.lineSeparator());
                    System.out.println(id + "; " + holder + "; " + amount);
                }
                System.out.println("Хранилище наполено.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
