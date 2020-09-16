package lesson_5.task_2_вариант_без_усложнений;

public class CPU {
    private final double clockRate;
    private final int cores;
    private final int cash;
    private final String name;
    private final String manufacturer;

    public CPU(double clockRate, int cores, int cash, String name, String manufacturer) {
        this.clockRate = clockRate;
        this.cores = cores;
        this.cash = cash;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void addCPU() {
        System.out.println("Характеристики процессора\n" + "- тактовая частота: " + clockRate +
                "\n- количество ядер: " + cores + "\n- кэш: " + cash + "\n- название: " + name +
                "\n- производитель: " + manufacturer + "\n");
    }
}
