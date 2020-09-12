package lesson_4.task_1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(2, 3);
        shape[1] = new Circle(3.3);
        shape[2] = new Rectangle(2, 4);

        for (Shape sh : shape) {
            System.out.printf("Площадь фигуры: %s \n", sh.square());
        }
    }
}
