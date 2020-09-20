package lesson_6.task_2;

public class Main {

    public static void main(String[] args) {
        // Задаем кол-во фруктов в коробках
        int countApple = 18;
        int countOrange1 = 5;
        int countOrange2 = 12;

        // Создаем коробку с яблоками
        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < countApple; i++) {
            appleBox.addFruit(new Apple());
        }
        System.out.println("Вес яблок в коробке: " + appleBox.getWeight());

        // Создаем коробки с апельсинами
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < countOrange1; i++) {
            orangeBox1.addFruit(new Orange());
        }
        System.out.println("Вес апельсинов в первой коробке: " + orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < countOrange2; i++) {
            orangeBox2.addFruit(new Orange());
        }
        System.out.println("Вес апельсинов во второй коробке: " + orangeBox2.getWeight());

        // Сравниваем коробки яблок и апельсинов
        System.out.println("\nРавна ли коробка яблок и первая коробка апельсинов? Ответ: "
                + appleBox.compare(orangeBox2));

        // Пересыпаем апелисины из одной коробки в другую
        orangeBox1.toBox(orangeBox2);
        System.out.println("\nПересыпаем апельсины из первой коробки во вторую.");
        System.out.println("Вес апельсинов в первой коробке: " + orangeBox1.getWeight());
        System.out.println("Вес апельсинов во второй коробке: " + orangeBox2.getWeight());

    }
}