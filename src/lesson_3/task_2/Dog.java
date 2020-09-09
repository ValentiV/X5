package lesson_3.task_2;

public class Dog extends Animal {

    private int heightAtWithers;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, int heightAtWithers) {
        super(food, location);
        this.heightAtWithers = heightAtWithers;
    }

    public int getHeightAtWithers() {
        return heightAtWithers;
    }

    public void setHeightAtWithers(int heightAtWithers) {
        this.heightAtWithers = heightAtWithers;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака рычит!\n");
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет кость!\n");
    }

    @Override
    public String toString() {
        return "Patient: Dog. Food: " + getFood() + ". Location: " + getLocation() + ".";
    }
}
