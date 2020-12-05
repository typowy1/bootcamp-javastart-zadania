package lekcja8_zadanie1_firma_szkoleniowa;

public class Teacher extends Person {

    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", przedmiot nauczania: " + subject;
    }
}
