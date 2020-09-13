package lesson_5.task_1;

public class ConsoleFactory extends LogFactory {

    @Override
    public Logger creatorLog() {
        return new ConsoleLogger();
    }
}
