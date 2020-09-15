package lesson_4.task_1;

public class Triangle implements Shape {
    private double height;
    private double footing;

    public Triangle(double height, double footing) {
        this.height = height;
        this.footing = footing;
    }

    // Вычисляем площадь треугольника
    @Override
    public double square() {
        return height * footing / 2;
    }
}
