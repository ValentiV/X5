package lesson_5.task_1;

public class DbFactory extends LogFactory {

    @Override
    public Logger creatorLog() {
        return new DbLogger();
    }
}
