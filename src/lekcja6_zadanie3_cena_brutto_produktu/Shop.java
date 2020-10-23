package lekcja6_zadanie3_cena_brutto_produktu;

public class Shop {

    public static void main(String[] args) {

        Vat vat = new Vat();
        ProductUtils productUtils = new ProductUtils();
        Product[] products = productUtils.enterProducts();

        vat.showGrossPriceInfo(products, 0, vat);
        vat.showGrossPriceInfo(products, 1, vat);
        vat.showGrossPriceInfo(products, 2, vat);
        vat.calculateTheSumOfPricesFromOneCategory(products);
    }
}
