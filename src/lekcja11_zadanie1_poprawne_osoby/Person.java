package lekcja11_zadanie1_poprawne_osoby;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;


    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        checkWord(firstName, "imię");
        checkWord(firstName, "nazwisko");
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) throws NameUndefinedException {
        checkWord(firstName, "imię");

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        checkWord(lastName, "nazwisko");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + ", lastName='" + lastName + ", age=" + age + ", pesel='" + pesel;
    }

    private void checkWord(String word, String firstOrLastNameWord) throws NameUndefinedException {
        if (word == null) {
            throw new NameUndefinedException("Błędna wartość!, " + firstOrLastNameWord + " - nie moze być wartością null.");
        } else if (word.length() < 2) {
            throw new NameUndefinedException("Błędna wartość!, " + firstOrLastNameWord + ": " + word +
                    " - nie może zawierać mniej niż 2 znaki.");
        }
    }

    private void checkAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException("Błędna wartość! " + age + " - wiek nie może być mniejszy niż 1.");
        }
    }
}
