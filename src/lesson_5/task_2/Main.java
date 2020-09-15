package lesson_5.task_2;

public class Main {
    public static void main(String[] args){
        ComputerFacade comp1 = new ComputerFacade();
        ComputerFacade comp2 = new ComputerFacade();
        ComputerFacade comp3 = new ComputerFacade();
        comp1.createComputer("tester");
        comp2.createComputer("developer");
        comp3.createComputer("analyst");
    }
}
