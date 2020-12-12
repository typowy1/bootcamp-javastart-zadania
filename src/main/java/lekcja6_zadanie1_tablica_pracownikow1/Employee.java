package lekcja6_zadanie1_tablica_pracownikow1;

public class Employee {

    private String firstName;
    private String lastName;
    private double payment;

    public Employee(String firstName, String lastName, double payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
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

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

}
