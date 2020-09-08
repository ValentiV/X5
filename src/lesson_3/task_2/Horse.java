package lesson_3.task_2;

public class Horse extends Animal {

    private String horseshoes;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String horseshoes) {
        this(food, location);
        this.horseshoes = horseshoes;
    }

    public String getHorseshoes() {
        return horseshoes;
    }

    public void setHorseshoes(String horseshoes) {
        this.horseshoes = horseshoes;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошать ржет!\n");
    }

    @Override
    public void eat() {
        System.out.println("Лошать жует сено!\n");
    }

    @Override
    public String toString() {
        return "Patient: Horse. Food: " + getFood() + ". Location: " + getLocation() + ".";
    }

}
