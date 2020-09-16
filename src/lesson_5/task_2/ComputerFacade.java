package lesson_5.task_2;

public class ComputerFacade {
    String name;
    private final Disk disk = new Disk();

    public ComputerFacade() {
    }

    public void info() {
        disk.test();
    }

    public void createComputer(String name) {

        System.out.println("Собираем компьютер");
        Computer computer = new Computer();
        /*if (!name.equals("tester") || !name.equals("analyst") || !name.equals("developer")) {
            System.out.println("Компьютер не положен!");
        } else*/ if (name.equals("tester") || name.equals("analyst")) {
            System.out.println("test");
            CPUFactory cpu = new AMDFactory();
            cpu.chooseCPU();
        } else {
            IntelFactory cpu = new IntelFactory();
            cpu.chooseCPU();
        }
    }
}
