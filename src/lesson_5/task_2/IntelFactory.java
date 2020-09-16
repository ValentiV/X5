package lesson_5.task_2;

public class IntelFactory extends CPUFactory {

    @Override
    public CPU chooseCPU() {
        return new IntelCPU();
    }
}
