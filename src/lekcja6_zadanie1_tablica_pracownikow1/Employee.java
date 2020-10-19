package lekcja6_zadanie1_tablica_pracownikow1;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private double payment;

    public Employee(String firstName, String lastName, double payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    public Employee() {
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

    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię pracownika");
        String firstName = scanner.nextLine();
        System.out.println("Wprowadź nazwisko pracownika");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        int payment = scanner.nextInt();

        Employee employee = new Employee(firstName, lastName, payment);
        return employee;
    }
}
