package lekcja8_zadanie1_firma_szkoleniowa;

public class School {
    public static void main(String[] args) {

        Student[] students = SchoolUtils.enterStudents();
        Teacher[] teachers = SchoolUtils.enterTeachers();

        Group group1 = new Group("It", teachers, students);
        SchoolUtils.showGroupInfo(group1);
    }
}
