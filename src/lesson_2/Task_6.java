package lesson_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) { // Выводим описание числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            String description1 = null, description2;
            if (i == 0) {
                System.out.println("нулевое число");
            } else if (i > 0) {
                description1 = "положительное";
            } else {
                description1 = "отрицательное";
            }
            if (i % 2 == 0) {
                description2 = "четное";
            } else {
                description2 = "нечетное";
            }
            System.out.printf("You entered: %s %s число", description1, description2);
        } else System.out.println("Entered is not an integer!");
    }
}
