package lesson_4.task_2;

public class Main {
    public static void main(String[] args) {
        Engine engineLorry = new Engine(123.8, "Scania");
        Engine engineSportCar = new Engine(200, "Audi");
        Lorry lorry = new Lorry("Scania", "C", 2.0, engineLorry, 2);
        SportCar sportCar = new SportCar("Audi", "A", 1.2, engineSportCar, 334);

        lorry.start();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.stop();
        lorry.printInfo();
        sportCar.start();
        sportCar.turnRight();
        sportCar.turnLeft();
        sportCar.stop();
        sportCar.printInfo();
    }
}
