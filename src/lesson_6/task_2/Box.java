package lesson_6.task_2;

import java.util.ArrayList;

class Box<T extends Fruit> {

    private final ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.get(0).getWeight() * fruits.size();
        } else {
            return 0;
        }

    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void toBox(Box<T> box) {
        for (T fruit : this.fruits) {
            box.addFruit(fruit);
        }
        this.fruits.clear();
    }
}
