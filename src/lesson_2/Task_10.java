package lesson_2;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) { // Перемещаем нули в конец массива
        int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        int i = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                array[i++] = array[j];
            }
        }
        while (i < array.length)
            array[i++] = 0;

        System.out.println("Преобразованный массив: " + Arrays.toString(array));
    }
}
