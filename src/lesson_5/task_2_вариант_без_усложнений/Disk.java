package lesson_5.task_2_вариант_без_усложнений;

public class Disk {
    private final String manufacturer;
    private final int memoryCapacity;
    private final String type;
    private final double formFactor;

    public Disk(String manufacturer, int memoryCapacity, String type, double formFactor) {
        this.manufacturer = manufacturer;
        this.memoryCapacity = memoryCapacity;
        this.type = type;
        this.formFactor = formFactor;
    }

    public void addDisk() {
        System.out.println("Характеристики диска\n" + "- производитель: " + manufacturer + "\n- объем памяти: "
                + memoryCapacity + "\n- тип накопителя: " + type + "\n- форм-фактор: " + formFactor + "\n");
    }
}
