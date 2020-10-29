package lekcja8_zadanie1_firma_szkoleniowa;


import java.util.Scanner;

public class SchoolUtils {

    static Scanner scanner = new Scanner(System.in);

    public static Student enterStudents() {

        System.out.println("Wprowadzanie studenta:");

        String firstName = enterFirstName();
        String lastName = enterLastName();

        Student student1 = new Student();
        Student student = new Student(firstName, lastName, student1.getGrades());
        return student;
    }

    public static Teacher enterTeachers() {

        System.out.println("Wprowadzanie nauczyciela:");

        String firstName = enterFirstName();
        String lastName = enterLastName();
        String subject = enterSubject();

        Teacher teacher = new Teacher(firstName, lastName, subject);
        return teacher;
    }

    private static String enterFirstName() {
        System.out.println("Podaj imię: ");
        String firstName = scanner.nextLine();
        return firstName;
    }

    private static String enterSubject() {
        System.out.println("Podaj przedmiot nauczania:");
        String subject = scanner.nextLine();
        return subject;
    }

    private static String enterLastName() {
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        return lastName;
    }

    public static void showGroupInfo(Group group) {
        System.out.println();
        System.out.println("Nazwa grupy: " + group.getName());
        System.out.println("Nauczyciel: " + group.getTeachers().getInfo());
        System.out.println("Studenci:");
        for (Student student : group.getStudents()) {
            if (student != null) {
                System.out.println(student.getInfo());
            }
        }
    }

    public static void showStudentGradingHistoryInfo(Student student) {
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName()
                + ", historia ocen z przedmiowtów: ");
        for (Grade grade : student.getGrades()) {
            if (grade != null) {
                System.out.println(grade.getValue() + ", " + grade.getGroup().getName());
            }
        }
    }
}
