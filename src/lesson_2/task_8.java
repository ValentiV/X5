package lesson_2;

public class task_8 {
    public static void main(String[] args) {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = max(array);
        int sum1 = sum1(array);
        int sum2 = sum2(array);
        int count = count(array);
        float average = average(array);
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Сумма положительных чисел массива: " + sum1);
        System.out.println("Сумма четных отрицательных чисел массива: " + sum2);
        System.out.println("Количество положительных чисел массива: " + count);
        System.out.println("Седнее арифметическое отрицательных чисел массива: " + average);
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int j : array) {
            if (max < j) max = j;
        }
        return max;
    }

    public static int sum1(int[] array) { //Считаем сумму положительных чисел
        int sum = 0;

        for (int j : array) {
            if (j > 0) sum += j;
        }
        return sum;
    }

    public static int sum2(int[] array) { //Считаем сумму четных отрицательных чисел
        int sum = 0;

        for (int j : array) {
            if (j < 0 && j % 2 == 0) sum += j;
        }
        return sum;
    }

    public static int count(int[] array) { //Считаем количество положительных чисел
        int count = 0;

        for (int j : array) {
            if (j % 2 == 0) count ++;
        }
        return count;
    }

    public static float average(int[] array) { //Считаем среднее арифметическое отрицательных чисел
        float average;
        float sum = 0;
        float count = 0;

        for (int j : array) {
            if (j < 0){
                sum += j;
                count ++;
            }
        }
        average = sum / count;
        return average;
    }
}
