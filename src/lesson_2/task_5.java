package lesson_2;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) { // Определяем наименьшее число из трех введенных
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three integer: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        if (i<=j && i<=k) //равно на случай, если введены одинаковые числа
            System.out.println("Minimum number is: " + i);
        else if (j<=i && j<=k)
            System.out.println("Minimum number is: " + j);
        else System.out.println("Minimum number is: " + k);
    }
}