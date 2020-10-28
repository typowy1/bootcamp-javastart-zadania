package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class Student extends Person{

    private int id;
    private Grade[] grades = new Grade[100]; // tablica z ocenami studenta, określiliśmy maksymalnąwartosć ocen, tu określiliśmy z góry wielkość tablicy w przeciwieństwie do groupy
    private int gradeIndex; // liczba wystawionych ocen

    public Student(String firstName, String lastName, String pesel, String adderss, int id) {
        super(firstName, lastName, pesel, adderss);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public void addGrade(Grade grade){
        grades[gradeIndex] = grade; // pod ity index wstawiamy ocene którą ktoś przekazę
        gradeIndex++; // zabespieczenia nie robiliśmy ponieważ dużo miejsca jest w tablicy
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", nr indeksu: " + id + " " + gradeHistory();
    }

    // metoda zwraca historie ocen w postaci stringa
    private String gradeHistory(){
        String  history = "Oceny:\n";
        for (int i = 0; i < gradeIndex; i++) { // pętla wykona się tyle razy ile jest wystawionych ocen
            history += grades[i].getGroups().getName() + " " + grades[i].getGrade() + "\n";
        }
        return history;
    }
}
