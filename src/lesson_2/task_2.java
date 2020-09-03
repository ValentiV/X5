package lesson_2;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) { // Выводим сумму цифр целого трехзначного числа
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if(i < 100 | i > 1000){
                System.out.println("Entered is not a three-digit integer!");
            }
            else
                while (i != 0){
                    sum += (i%10);
                    i/=10;
            }
            System.out.println("The sum of the digits: " + sum);
        }
        else System.out.println("Entered is not an integer!");
    }
}
