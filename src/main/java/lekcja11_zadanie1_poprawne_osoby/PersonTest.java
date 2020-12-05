package lekcja11_zadanie1_poprawne_osoby;

public class PersonTest {
    public static void main(String[] args) {

        Person person = null;
        try {
            person = new Person("kk", "kk", 2, "5568545467");
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
            System.out.println("Koniec programu");
        }
        System.out.println(person);

        try {
            person.setAge(5);
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(person);

        try {
            person.setFirstName("pr");
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(person);

        try {
            person.setLastName("tt");
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(person);
    }
}
