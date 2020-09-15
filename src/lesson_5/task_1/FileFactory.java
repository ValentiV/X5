package lesson_5.task_1;

public class FileFactory extends LogFactory {
    String message;

    public String getMessage() {
        return message;
    }

    @Override
    public Logger creatorLog() {
        return new FileLogger();
    }
}
