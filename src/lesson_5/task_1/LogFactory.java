package lesson_5.task_1;

public abstract class LogFactory {
    private String message;

    public void logType(String message) {
        Logger logger = creatorLog();
        logger.log(message);
    }

    public abstract Logger creatorLog();
}
