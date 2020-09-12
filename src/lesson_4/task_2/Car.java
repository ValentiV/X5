package lesson_4.task_2;

public abstract class Car {
    private String mark;
    private String carClass;
    private Double weight;
    private Engine engine;

    public Car(String mark, String carClass, Double weight, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public final void turnRight() {
        System.out.println("Поворот направо");
    }

    public final void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
