package lekcja8_zadanie1_firma_szkoleniowa;

public class Student extends Person {

    private Grade[] grades;

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
}
