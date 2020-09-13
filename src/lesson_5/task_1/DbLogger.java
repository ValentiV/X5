package lesson_5.task_1;

public class DbLogger implements Logger {
    public void log(String message) {
        System.out.println("Log into database: " + message);
    }
}
