package lekcja6_zadanie1_tablica_pracownikow1;

import java.util.Scanner;

public class Hr {

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
