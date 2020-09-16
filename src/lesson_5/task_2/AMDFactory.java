package lesson_5.task_2;

public class AMDFactory extends CPUFactory {
    @Override
    public CPU chooseCPU() {
        System.out.println("test");
        return new AMDCPU();
    }
}
