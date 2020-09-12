package lesson_4.task_1;

import java.lang.Math;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Вычисляем площадь круга
    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}
