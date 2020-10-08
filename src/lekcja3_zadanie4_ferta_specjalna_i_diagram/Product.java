package lekcja3_zadanie4_ferta_specjalna_i_diagram;

public class Product {

    String name;
    double price;
    String description;
    Category category;
    SpecialOffer specialOffer;

    Product(String n, double p, String d, Category c) {
        name = n;
        price = p;
        description = d;
        category = c;
    }

    Product(String n, double p, String d) {
        name = n;
        price = p;
        description = d;
    }

    void showProductWithCategory() {
        showProductWithoutCategory();
        System.out.println("Kategoria: " + category.name + ", opis: " + category.description);
    }

    void showProductWithoutCategory() {
        System.out.println("Nazwa produktu: " + name);
        System.out.println("Cena: " + price + "zł");
        System.out.println("Opis:  " + description);
    }
}
