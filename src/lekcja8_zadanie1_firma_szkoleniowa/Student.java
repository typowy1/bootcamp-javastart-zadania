package lekcja8_zadanie1_firma_szkoleniowa;

import lekcja6_zadanie1_tablica_pracownikow1.Employee;

public class Student extends Person {

    private Grade[] grades;

//    public Student(String firstName, String lastName, Grade[] grades) {
//        super(firstName, lastName);
//        this.grades = grades;
//    }
//
//    public Student(String firstName, String lastName, int gradeNumber) {
//        super(firstName, lastName);
//        this.grades = new Grade[gradeNumber];
//    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public Grade getGrades(int index) {
        return grades[index];
    }

    public Grade[] getGrades() {
        return grades;
    }
}
