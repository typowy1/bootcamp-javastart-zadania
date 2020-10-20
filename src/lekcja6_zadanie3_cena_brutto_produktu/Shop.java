package lekcja6_zadanie3_cena_brutto_produktu;

public class Shop {

    public static void main(String[] args) {
        Product[] product = new Product[3];
        product[0] = new Product("Cola", "CocaCola oryginalna", 5, "Napoje");
        product[1] = new Product("Snikers", "Baton czekoladowy", 3, "Słodycze");
        product[2] = new Product("Piwo", "Piwo IPA", 10, "Alkohol");
        Vat vat = new Vat();

        vat.showGrossPriceInfo(product, 0, vat);
        vat.showGrossPriceInfo(product, 1, vat);
        vat.showGrossPriceInfo(product, 2, vat);

    }
}
