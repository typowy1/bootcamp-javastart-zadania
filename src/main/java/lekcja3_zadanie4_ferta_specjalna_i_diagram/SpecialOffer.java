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

    void priceAfterDiscount() {
        double result = product.price * (1 - discount);
        System.out.println("Cena po rabacie: " + result + "zł");
    }

    void showSpecialOffer() {
        System.out.println(description + " " + durationFromTo);
    }
}
