package lesson_3.task_3;

public class Aspirant extends Student {
    private String researchWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String researchWork) {
        super(firstName, lastName, group, averageMark);
        this.researchWork = researchWork;
    }

    public String getResearchWork() {
        return researchWork;
    }

    public void setResearchWork(String researchWork) {
        this.researchWork = researchWork;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        }
        return 180;
    }
}
