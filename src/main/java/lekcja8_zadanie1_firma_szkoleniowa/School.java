package lekcja8_zadanie1_firma_szkoleniowa;

public class School {
    public static void main(String[] args) {

        Student[] students = new Student[30];
        students[0] = SchoolUtils.enterStudents();

        Teacher[] iTTeachers = new Teacher[100];
        iTTeachers[0] = SchoolUtils.enterTeachers();

        Group programowanie = new Group("Programowanie", iTTeachers[0], students);
        Group informatyka = new Group("Informatyka", iTTeachers[0], students);

        Grade grade = new Grade(5, programowanie);
        students[0].addGrade(grade);
        Grade grade1 = new Grade(3, informatyka);
        students[0].addGrade(grade1);

        SchoolUtils.showGroupInfo(programowanie);

        System.out.println();
        SchoolUtils.showStudentGradingHistoryInfo(students[0]);
    }
}
