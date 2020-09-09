package lesson_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) { // Определяем наименьшее число из трех введенных
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of massive: ");
        int s = scanner.nextInt();
        int[] array = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.println("Enter an integer: ");
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Minimum number is: " + min(array));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) min = j;
        }
        return min;
    }
}