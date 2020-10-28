package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Piotr", "Kowalkiewicz", "1234567788",
                "Warszawa", 5000);
        Teacher teacher2 = new Teacher("Tomasz", "Zabłowski", "56634535345",
                "Michałowice", 7000);

        Student student1 = new Student("Rafał", "Kowalkiewicz", "3456789922",
                "Pruszków", 123);
        Student student2 = new Student("Lukasz", "Zienkiewicz", "5657576567",
                "Komorow", 12345);

        Group group1 = new Group(teacher1, 10, "Programowanie");
        group1.addStudent(student1); // do grupy 1 dodajemy studenta 1 itd, przez wywołanie metody sddStudent
        group1.addStudent(student2);
        group1.fullInfo();

        Group group2 = new Group(teacher2, 10, "Matematyka");
        group1.addStudent(student1);

        Grade grade1 = new Grade(student2, group1, 5);
        Grade grade2 = new Grade(student2, group2, 3);
        student2.addGrade(grade1);
        student2.addGrade(grade2);
        System.out.println(student2.getInfo());
    }
}
