package lesson_2;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i==0) {
                System.out.printf("Result: %d", 10);
            }
            else
                if (i<0) {
                System.out.printf("Result: %d", i-2);
            }
            else System.out.printf("Result: %d", ++i);
        }
        else System.out.println("Entered is not an integer!");
    }
}
