package lesson_2;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.printf("Last digit of the number: %d", i=i%10);
        }
        else System.out.println("Entered is not an integer!");
    }
}