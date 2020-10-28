package lekcja8_zadanie1_firma_szkoleniowa;


import java.util.Scanner;

public class SchoolUtils {

    static Scanner scanner = new Scanner(System.in);


    public static Student enterStudents(Grade[] grades) {

        System.out.println("Wprowadzanie studenta:");

//        int quantity = enterNumberOfPeople();
//        Student[] students = new Student[quantity];

//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Podaj dane studenta: ");

        String firstName = enterFirstName();
        String lastName = enterLastName();

        Student student = new Student(firstName, lastName, grades);
//        }
        return student;
    }


//    public static Student[] enterStudents(int gradeNumber) {
//
//        System.out.println("Wprowadanie studentów:");
//
//        int quantity = enterNumberOfPeople();
//        Student[] students = new Student[quantity];
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Podaj dane studenta " + (i + 1));
//
//            String firstName = enterFirstName();
//            String lastName = enterLastName();
//
//            students[i] = new Student(firstName, lastName, gradeNumber);
//        }
//        return students;
//    }

    public static Teacher enterTeachers() {

        System.out.println("Wprowadzanie nauczycielia:");

//        int quantity = enterNumberOfPeople();
//        Teacher[] teachers = new Teacher[quantity];

//        for (int i = 0; i < teachers.length; i++) {
//            System.out.println("Podaj dane nauczyciela " + (i + 1));

        String firstName = enterFirstName();
        String lastName = enterLastName();
        String subject = enterSubject();

        Teacher teacher = new Teacher(firstName, lastName, subject);
//        }
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


    private static int enterNumberOfPeople() {
        System.out.println("Podaj ilość osób do wprowadzenia:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        return quantity;
    }

    private static void showTeachersInfo(Teacher[] teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getInfo());
        }
    }

    private static void showStudentsInfo(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
    }

    public static void showGroupInfo(Group group) {
        System.out.println(group.getName());
        System.out.println("Nauczyciel: " + group.getTeachers().getInfo());
        System.out.println("Studenci");
        for (Student student : group.getStudents()) {
            System.out.println(student.getInfo());
        }

//        for (Student student : group.getStudents()) {
//            System.out.println(student.getInfo());
//        }
    }


//    public static void showGroupInfo(Group group) {
//        System.out.println("Nazwa grupy: " + group.getName());
//        System.out.println("Nauczyciel:");
//        showTeachersInfo(group.getTeachers());
//        System.out.println("Uczniowie:");
//        showStudentsInfo(group.getStudents());
//
//    }
}
