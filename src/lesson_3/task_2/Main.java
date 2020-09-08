package lesson_3.task_2;

public class Main {
    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости", "Двор");
        animals[1] = new Cat("Молоко", "Квартира");
        animals[2] = new Horse("Сено", "Конюшня");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
