package lekcja6_zadanie1_tablica_pracownikow1;

public class Accountancy {

    public void paymentsSum(Employee[] employees) {
        double sum = employees[0].getPayment() + employees[1].getPayment();
        System.out.println("Firma musi wydać na wypłaty dla pracowników: " + sum + "zł");
    }
}
