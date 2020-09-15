package lesson_5.task_1;

public class Calc {
    public double num1;
    public double num2;
    public char operator;

    LogFactory logFactory1 = new ConsoleFactory();
    LogFactory logFactory2 = new FileFactory();
    LogFactory logFactory3 = new DbFactory();

    public Calc(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public void sCalc(char operator) {
        switch (operator) {
            case '+' -> add();
            case '-' -> subtract();
            case '*' -> multiply();
            case '/' -> split();
            default -> System.out.println("Операция не поддерживается!");
        }
    }

    public void add() {
        logFactory1.logType(Double.toString(num1 + num2));
        logFactory2.logType(Double.toString(num1 + num2));
        logFactory3.logType(Double.toString(num1 + num2));
    }

    public void subtract() {
        logFactory1.logType(Double.toString(num1 - num2));
        logFactory2.logType(Double.toString(num1 - num2));
        logFactory3.logType(Double.toString(num1 - num2));
    }

    public void multiply() {
        logFactory1.logType(Double.toString(num1 * num2));
        logFactory2.logType(Double.toString(num1 * num2));
        logFactory3.logType(Double.toString(num1 * num2));
    }

    public void split() {
        if (num2 == 0) {
            logFactory1.logType(null);
            logFactory2.logType(null);
            logFactory3.logType(null);
        } else {
            logFactory1.logType(Double.toString(num1 / num2));
            logFactory2.logType(Double.toString(num1 / num2));
            logFactory3.logType(Double.toString(num1 / num2));
        }
    }
}