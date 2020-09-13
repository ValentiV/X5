package lesson_5.task_1;

public abstract class LogFactory {
    String message;

    public void logType(String message) {
        Logger logger = creatorLog();
        logger.log(message);
    }

    public abstract Logger creatorLog();
}
