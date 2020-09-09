package lesson_3.task_1;

public class Phone {

    String number;
    String model;
    int weight;
    String name;

    //Конструктор с 3 параметрами
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    //Метод выводит имя звонящего
    public void receiveCall(String name) {
        this.name = name;
        System.out.printf("Звонит %s.\n", name);
    }

    //Метод возвращает номер
    public String getNumber() {
        return number;
    }

    //Конструктор с 2 параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //Конструктор без параметров
    public Phone() {
    }

    //Метод выводит имя и номер звонящего
    public void receiveCall(String number, String name) {
        System.out.printf("Звонит %s. Номер %s.\n", this.name, this.number);
    }

    //Метод выводит номер телефона для отправки сообщения
    public static void sendMessage(String... num) {
        System.out.println("Сообщение отправлено на номера:");
        for (String s : num) {
            System.out.println(s);
        }
    }
}
