package lesson_5.task_2;

public abstract class CPUFactory {

    public void chouseCPU(String name) {
        CPU cpu = chooseCPU();
        cpu.setResult();
        System.out.println("test");
    }

    public abstract CPU chooseCPU();

}
