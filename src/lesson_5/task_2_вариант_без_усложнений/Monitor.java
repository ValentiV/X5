package lesson_5.task_2_вариант_без_усложнений;

public class Monitor {
    private final double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    public void addMonitor() {
        System.out.println("Диагональ монитора: " + diagonal + "\n");
    }
}
