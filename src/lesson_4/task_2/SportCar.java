package lesson_4.task_2;

public class SportCar extends Car {
    double topSpeed;

    public SportCar(String mark, String carClass, Double weight, Engine engine, double topSpeed) {
        super(mark, carClass, weight, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Выводим информацию об автомобиле
    @Override
    public void printInfo() {
        System.out.printf("Информация о SportCar: марка - %s, класс - %s, вес - %f, предельная скорость - %f\n%s",
                getMark(), getCarClass(), getWeight(), getTopSpeed(), getEngine());
    }
}
