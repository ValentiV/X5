package lesson_2;
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) { // Выводим сумму разговора в зависимости от кода города
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите код города: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case 905:
                    System.out.println("Москва. Стоимость разговора 41.5.");
                    break;
                case 194:
                    System.out.println("Ростов. Стоимость разговора 19.4.");
                    break;
                case 491:
                    System.out.println("Краснодар. Стоимость разговора 26.9.");
                    break;
                case 800:
                    System.out.println("Киров. Стоимость разговора 50.");
                    break;
                default:
                    System.out.println("Город не обслуживается!");
                    break;
            }
        }
        else System.out.println("Введен не код!");
    }
}
