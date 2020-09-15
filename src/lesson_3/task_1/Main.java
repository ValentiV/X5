package lesson_3.task_1;

import lesson_3.task_2.Animal;

public class Main {

    public static void main(String[] args) {

        Phone[] phones = new Phone[3];

        phones[0] = new Phone("+79536782721", "3S_PRO", 124);
        phones[1] = new Phone("+79536782722", "4S_PRO", 121);
        phones[2] = new Phone("+79536782723", "5S_PRO", 118);

        for (Phone phone : phones) {
            System.out.println(phones[0].number + " " + phones[0].model + " " + phones[0].weight);
        }

        phones[0].receiveCall("Андрей");
        phones[1].receiveCall("Мама");
        phones[2].receiveCall("Ярослав");

        phones[0].receiveCall(phones[0].getNumber(), "Андрей");
        phones[1].receiveCall(phones[1].getNumber(), "Мама");
        phones[2].receiveCall(phones[2].getNumber(), "Ярослав");

    }
}

