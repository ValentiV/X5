package lesson_3.task_2;

public class Cat extends Animal {

    private double lengOfTail;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, double lengOfTail) {
        super(food, location);
        this.lengOfTail = lengOfTail;
    }

    public double getLengOfTail() {
        return lengOfTail;
    }

    public void setLengOfTail(double lengOfTail) {
        this.lengOfTail = lengOfTail;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мурчит!\n");
    }

    @Override
    public void eat() {
        System.out.println("Кот лакает молоко!\n");
    }

    @Override
    public String toString() {
        return "Patient: Cat. Food: " + getFood() + ". Location: " + getLocation() + ".";
    }
}
