package lekcja6_zadanie1_tablica_pracownikow1;

public class Accountancy {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee[] employees = new Employee[2];
        employees[0] = employee.createEmployee();
        employees[1] = employee.createEmployee();
        double paymentsSum = employees[0].getPayment() + employees[1].getPayment();
        System.out.println("Firma musi wydać na wypłaty dla pracowników: " + paymentsSum + "zł");
    }
}
