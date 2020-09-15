package lesson_4.task_1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Вычисляем площадь круга
    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}
