package lesson_5.task_2_вариант_без_усложнений;

public class VCard {
    private final String manufacturer;
    private final String typeRAM;
    private final int memoryCapacity;
    private final String cooling;

    public VCard(String manufacturer, String typeRAM, int memoryCapacity, String cooling) {
        this.manufacturer = manufacturer;
        this.typeRAM = typeRAM;
        this.memoryCapacity = memoryCapacity;
        this.cooling = cooling;
    }

    public void addVCard() {
        System.out.println("Характеристики видеокарты\n" + "- производитель: " + manufacturer +
                "\n- тип памяти: " + typeRAM + "\n- объем памяти: " + memoryCapacity + "\n- охлождение: "
                + cooling + "\n");
    }
}
