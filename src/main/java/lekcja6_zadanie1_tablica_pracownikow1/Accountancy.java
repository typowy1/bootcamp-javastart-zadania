package lekcja6_zadanie1_tablica_pracownikow1;

public class Accountancy {


    public void paymentsSum(Company company) {
        double sum = company.get(0).getPayment() + company.get(1).getPayment();
        System.out.println("Firma musi wydać na wypłaty dla pracowników: " + sum + "zł");
    }
}
