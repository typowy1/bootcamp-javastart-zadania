package lekcja11_zadanie1_poprawne_osoby;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Ra", "Ka", 2, "5568545467");
        System.out.println(person);
        person.setAge(3);
        System.out.println(person);
        person.setFirstName("pf");
        System.out.println(person);
        person.setLastName("ta");
        System.out.println(person);
    }

}
