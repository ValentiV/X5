package lesson_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) { // Выводим сумму разговора в зависимости от кода города
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int min = 10;
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case 905:
                    System.out.println("Москва. Стоимость разговора " + 4.15 * min);
                    break;
                case 194:
                    System.out.println("Ростов. Стоимость разговора " + 1.94 * min);
                    break;
                case 491:
                    System.out.println("Краснодар. Стоимость разговора " + 2.69 * min);
                    break;
                case 800:
                    System.out.println("Киров. Стоимость разговора " + 5 * min);
                    break;
                default:
                    System.out.println("Город не обслуживается!");
                    break;
            }
        } else System.out.println("Введен не код!");
    }
}
