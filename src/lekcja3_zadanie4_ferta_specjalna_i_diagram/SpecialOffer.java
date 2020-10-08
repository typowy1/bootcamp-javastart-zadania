package lekcja3_zadanie4_ferta_specjalna_i_diagram;

public class SpecialOffer {

    String description;
    String durationFromTo;
    double discount;
    Product product;

    SpecialOffer(String de, String du, double di, Product p) {

        description = de;
        durationFromTo = du;
        discount = di;
        product = p;
    }

    void discountValue() {
        product.price = product.price * (1 - discount);
    }

    void showSpecialOffer() {
        System.out.println(description + " " + durationFromTo);
    }
}
