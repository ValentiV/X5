package lesson_4.task_2;

public class Lorry extends Car {
    double carryingCapacity;

    public Lorry(String mark, String carClass, Double weight, Engine engine, double carryingCapacity) {
        super(mark, carClass, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    // Выводим информацию об автомобиле
    @Override
    public void printInfo() {
        System.out.printf("Информация о грузовике: марка - %s, класс - %s, вес - %f, грузоподъемность - %f\n%s",
                getMark(), getCarClass(), getWeight(), getCarryingCapacity(), getEngine());
    }

}

