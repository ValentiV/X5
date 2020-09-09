package lesson_3.task_3;

public class Main {
    public static void main(String[] args) {

        //Student student = new Aspirant("Smith", "Alex", "12A", 5.0, "NewWork");

        Student[] students = new Student[5];
        students[0] = new Student("Smith", "Alex", "12A", 5.0);
        students[1] = new Student("Braun", "Tod", "12B", 4.9);
        students[2] = new Aspirant("Holmes", "Sherlock ", "1A", 5.5, "Murder in the woods");
        students[3] = new Aspirant("Gils", "Andrew ", "13D", 2.5, "Non");
        students[4] = new Aspirant("London", "Jack ", "1B", 5, "WHITE FANG");


        for (Student student : students) {
            System.out.println("Стипендия студента " + student.firstName + ": " + student.getScholarship());
        }

    }


}
