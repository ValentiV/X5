package lesson_5.task_2_вариант_без_усложнений;

public class ComputerFacade {
    public Monitor monitor;
    public CPU cpu;
    public RAM ram;
    public VCard vcard;
    public Disk disk;

    public ComputerFacade() {
        this.monitor = new Monitor(27.5);
        this.cpu = new CPU(3.8, 12, 64, "Ryzen 9 3900X", "AMD");
        this.ram = new RAM("Patriot", 16, 2666, "DDR4");
        this.vcard = new VCard("Asus", "GDDR5", 4, "Активное");
        this.disk = new Disk("Samsung", 256, "SSD", 2.5);
    }

    public void createComputer() {
        System.out.println("Собираем компьютер!\n");
        monitor.addMonitor();
        cpu.addCPU();
        ram.addRAM();
        vcard.addVCard();
        disk.addDisk();
    }

}
