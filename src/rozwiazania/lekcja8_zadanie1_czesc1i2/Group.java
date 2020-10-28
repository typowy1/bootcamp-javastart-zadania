package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class Group {

    private Teacher teacher;
    private Student[] students;
    private int index = 0; //liczba dodanych studentów, index dla metodyw dodającej studenta, wartoś początkowa którą będziemy zwiększać,
    private String name;

    public Group(Teacher teacher, int groupSize, String name) {
        this.teacher = teacher;
        students = new Student[groupSize]; // w konstruktorze tworzymy tablice, czyli ilu studentów będzie w grupie
        this.name = name;
    }

    public void addStudent(Student student) { // dodawanie studentów do tablicy, jak toś wywoła metode 1 raz to wstawiamy na 0 miejsce itd.
        if (index < students.length) { // zabezpieczenie przed wywołaniem większym niż wielkość tablicy czyli nie dodamy 6 studenta jeśli tablica ma wielkość 5
            students[index] = student;
            index++; //zwiekszamy licznik o 1 żeby nie nadpisywać syudenta a dodać na nowe miejsce
        } else {
            System.out.println("Grupa pełna");
        }

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void fullInfo(){ // wyświetlanie pełnej informacji o grupie
        System.out.println(name);
        System.out.println("Prowadzący: " + teacher.getInfo()); // informacja o nauczycielu z poziomu grupy
        System.out.println("Studenci w grupie:");
        for (int i = 0; i < index; i++) {// lepiej użyć for dlatego ze pętla wykona się tyle razy ile jest wartość indexu, a index == ilość dodanych studentów
            System.out.println(students[i].getInfo());// zabezpieczyliśmy się przed NullPointegExeption

        }

//        for (Student student : students) { // wyświeltlimy wszystkich studentów
//            if(student != null){ // zabespieczenie przed nulami w tablicy, czyli NullPointerException
//                System.out.println(student.getInfo());
//            }
    }
}
