package lesson_4.task_2;

public class Engine {
    double power;
    String manufacture;

    public Engine(double power, String manufacture) {
        this.power = power;
        this.manufacture = manufacture;
    }

    public double getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    // Передаем информацию о двигателе
    public String toString() {
        return "Информация о двигателе: мощность - " + getPower() + ", производитель - " + getManufacture() + "\n\n";
    }

}
