package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private String adderss;

    public Person(String firstName, String lastName, String pesel, String adderss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.adderss = adderss;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getInfo(){
        return  firstName + " " + lastName +  ", pesel: " + pesel + ", adderss: " + adderss;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adderss='" + adderss + '\'' +
                '}';
    }
}
