package lesson_2;

import java.util.Arrays;

public class task_9 {
    public static void main(String[] args) { // Разворачиваем массив
        int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Элементы массива в обратном порядке: " + Arrays.toString(array));
    }
}
