package lekcja8_zadanie1_firma_szkoleniowa;

public class Student extends Person {

    public static final int MAX_GRADE_SIZE = 10;
    private Grade[] grades = new Grade[MAX_GRADE_SIZE];
    private int currentGradeAmount = 0;

    public Student() {
    }

    public Student(String firstName, String lastName, Grade[] initialGrades) {
        super(firstName, lastName);
        for(int i =0; i < initialGrades.length; i++){
            if(initialGrades[i] == null){
                continue;
            }
            addGrade(initialGrades[i]);
        }
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
