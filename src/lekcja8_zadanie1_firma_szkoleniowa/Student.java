package lekcja8_zadanie1_firma_szkoleniowa;

public class Student extends Person {

    public static final int MAX_GRADE_SIZE = 10;
    private Grade[] grades = new Grade[MAX_GRADE_SIZE];
    private int currentGradeAmount = 0;

    public Student(String firstName, String lastName, Grade[] grades) {
        super(firstName, lastName);
        this.grades = grades;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public void addGrade(Grade grade){
        grades[currentGradeAmount] = grade;
        currentGradeAmount++;
    }
}
