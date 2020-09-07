package lesson_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) { // Определяем знак числа. Если +, выводим число +1, если -, выводим число - 2, если 0, заменяем на 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i == 0) {
                System.out.printf("Result: %d", 10);
            } else if (i < 0) {
                System.out.printf("Result: %d", i - 2);
            } else System.out.printf("Result: %d", ++i);
        } else System.out.println("Entered is not an integer!");
    }
}
