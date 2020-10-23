package lekcja6_zadanie3_cena_brutto_produktu;

import java.util.Scanner;

public class Vat {
    Scanner scanner = new Scanner(System.in);

    public double vatRates(Product product) {

        double result = 0;
        switch (product.getCategory()) {
            case "Napoje":
                result = product.getNetPrice() * 0.1 + product.getNetPrice();
                break;
            case "Słodycze":
                result = product.getNetPrice() * 0.2 + product.getNetPrice();
                break;
            case "Alkohol":
                result = product.getNetPrice() * 0.3 + product.getNetPrice();
                break;
            default:
                result = 0;
        }
        return result;
    }

    public void showGrossPriceInfo(Product[] product, int productNumber, Vat vat) {
        if (vat.vatRates(product[productNumber]) == 0) {
            System.out.println("Błędna kategoria!");
        } else {
            System.out.println("Cena brutto produktu " + product[productNumber].getName() + " wynosi: "
                    + vat.vatRates(product[productNumber]) + "zł");
        }
    }

    void calculateTheSumOfPricesFromOneCategory(Product[] product) {
        Vat vat = new Vat();
        double sum = 0;
        System.out.println("Podaj kategorię produktu: ");
        String productCategory = scanner.nextLine();
        for (Product product1 : product) {
            if (productCategory.equals(product1.getCategory())) {
                sum += vat.vatRates(product1);
            }
        }
        System.out.println("Suma cen brutto dla kategorii " + productCategory + " wynosi: " + sum + "zł");
    }
}
