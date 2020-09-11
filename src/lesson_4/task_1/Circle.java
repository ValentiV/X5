package lesson_4.task_1;

import java.lang.Math;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double suqare() {
        return Math.PI * (radius * radius);
    }
}
