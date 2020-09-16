package lesson_5.task_2_вариант_без_усложнений;

public class RAM {
    private final String manufacturer;
    private final int memoryCapacity;
    private final int frequency;
    private final String typeRAM;

    public RAM(String manufacturer, int memoryCapacity, int frequency, String typeRAM) {
        this.manufacturer = manufacturer;
        this.memoryCapacity = memoryCapacity;
        this.frequency = frequency;
        this.typeRAM = typeRAM;
    }

    public void addRAM() {
        System.out.println("Характеристики оперативной памяти\n" + "- производитель: " + manufacturer +
                "\n- объем памяти: " + memoryCapacity + "\n- частота: " + frequency + "\n- тип памяти: "
                + typeRAM + "\n");
    }
}
