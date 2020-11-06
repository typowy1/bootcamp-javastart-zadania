package lekcja11_zadanie1_poprawne_osoby;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    private void checkWord(String word, String firstOrLastNameWord) {
        if (word == null) {
            throw new NameUndefinedException("Błędna wartość!, " + firstOrLastNameWord + " - nie moze być wartością null.");
        } else if (word.length() < 2) {
            throw new NameUndefinedException("Błędna wartość!, " + firstOrLastNameWord + ": " + word +
                    " - nie może zawierać mniej niż 2 znaki.");
        }
    }

    private void checkFirstName(String firstName) {
        checkWord(firstName, "imię");
    }

    private void checkLastName(String lastName) {
        checkWord(lastName, "nazwisko");
    }

    private void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Błędna wartość! " + age + " - wiek nie może być mniejszy niż 1.");
        }
    }
}
