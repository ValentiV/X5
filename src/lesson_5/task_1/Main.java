package lesson_5.task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1 = getNum();
        double num2 = getNum();
        char operator = getOperator();
        Calc calc = new Calc(num1, num2, operator);
        calc.sCalc(operator);
    }

    public static double getNum() {
        System.out.print("Введите число: ");
        double num;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Введено не число");
            scanner.next();
            num = getNum();
        }
        return num;
    }

    public static char getOperator() {
        System.out.print("Введите операцию: ");
        char operator;
        Scanner scanner = new Scanner(System.in);
        operator = scanner.next().charAt(0);
        return operator;
    }
}
