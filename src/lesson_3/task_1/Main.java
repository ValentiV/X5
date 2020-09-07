package lesson_3.task_1;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+79536782721", "3S_PRO", 124);
        Phone phone2 = new Phone("+79536782722", "4S_PRO", 121);
        Phone phone3 = new Phone("+79536782723", "5S_PRO", 118);

        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        phone1.receiveCall("Андрей");
        phone2.receiveCall("Мама");
        phone3.receiveCall("Ярослав");

        String phone1Number = phone1.getNumber();
        String phone2Number = phone2.getNumber();
        String phone3Number = phone3.getNumber();

        phone1.receiveCall(phone1Number, "Андрей");
        phone2.receiveCall(phone2Number, "Мама");
        phone3.receiveCall(phone3Number, "Ярослав");

        Phone.sendMessage(phone1Number, phone2Number, phone3Number);
    }

}
