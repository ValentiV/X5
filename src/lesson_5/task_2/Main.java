package lesson_5.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Введите должность:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        ComputerFacade comp = new ComputerFacade();
        comp.createComputer(name);

//        ComputerFacade comp2 = new ComputerFacade();
//        ComputerFacade comp3 = new ComputerFacade();
//        comp1.createComputer("tester");
//        comp2.createComputer("developer");
//        comp3.createComputer("analyst");
    }
}
