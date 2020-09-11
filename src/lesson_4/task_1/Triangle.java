package lesson_4.task_1;

public class Triangle implements Shape {
    double height;
    double footing;

    public Triangle(double height, double footing) {
        this.height = height;
        this.footing = footing;
    }

    @Override
    public double square() {
        return height*footing/2;
    }
}
