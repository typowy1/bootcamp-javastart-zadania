package lekcja8_zadanie1_firma_szkoleniowa;

public class School {
    public static void main(String[] args) {

        Grade[] grades = new Grade[10];
        Student[] students = new Student[30];
        students[0] = SchoolUtils.enterStudents(grades);

        Teacher[] iTTeachers = new Teacher[100];
        iTTeachers[0] = SchoolUtils.enterTeachers();

        Group programowanie = new Group("Programowanie", iTTeachers[0], students);
        Group informatyka = new Group("Informatyka", iTTeachers[0], students);

        grades[0] = new Grade(5, programowanie);
        grades[1] = new Grade(4, informatyka);

        SchoolUtils.showGroupInfo(programowanie);

        System.out.println();
        SchoolUtils.showStudentInfo(students[0]);


    }
}
