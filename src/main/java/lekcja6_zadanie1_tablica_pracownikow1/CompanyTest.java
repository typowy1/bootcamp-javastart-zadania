package lekcja6_zadanie1_tablica_pracownikow1;

public class CompanyTest {
    public static void main(String[] args) {

        Company company = new Company(2);
        Hr hr = new Hr();
        company.add(hr.createEmployee());
        company.add(hr.createEmployee());

        Accountancy accountancy = new Accountancy();
        accountancy.paymentsSum(company);
    }
}
