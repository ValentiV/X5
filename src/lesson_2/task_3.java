package lesson_2;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) { // Определяем знак числа. Если +, выводим число +1, иначе число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i==0) {
                System.out.println("You entered zero!");
            }
            else
                if (i<0) {
                    System.out.println("You entered:" + i);
                }
                else System.out.printf("Result: %d", ++i);
        }
        else System.out.println("Entered is not an integer!");
    }
}
