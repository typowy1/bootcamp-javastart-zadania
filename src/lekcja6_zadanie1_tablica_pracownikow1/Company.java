package lekcja6_zadanie1_tablica_pracownikow1;

public class Company {
    public static void main(String[] args) {

        Hr hr = new Hr();
        Employee[] employees = new Employee[2];
        employees[0] = hr.createEmployee();
        employees[1] = hr.createEmployee();
        Accountancy accountancy = new Accountancy();
        accountancy.paymentsSum(employees);
    }
}
