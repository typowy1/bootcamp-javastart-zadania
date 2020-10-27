package lekcja8_zadanie1_firma_szkoleniowa;

public class School {
    public static void main(String[] args) {

        Student[] students = SchoolUtils.enterStudents();
        Teacher[] teachers = SchoolUtils.enterTeachers();

        Group groupIT = new Group("IT", teachers, students);
        SchoolUtils.showGroupInfo(groupIT);
    }
}
