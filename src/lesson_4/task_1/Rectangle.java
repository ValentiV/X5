package lesson_4.task_1;

public class Rectangle implements Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Вычисляем площадь квадрата
    @Override
    public double square() {
        return a * b;
    }
}
