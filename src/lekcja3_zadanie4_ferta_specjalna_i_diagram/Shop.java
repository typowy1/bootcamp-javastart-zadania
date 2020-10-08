package lekcja3_zadanie4_ferta_specjalna_i_diagram;

public class Shop {
    public static void main(String[] args) {
        Category category1 = new Category("Słodycze", "Coś słodkiego dla każdego.");
        Category category2 = new Category("Alkohol", "Alkohole Świata.");

        Product product1 = new Product("Milka", 5, "Czekolada Mleczna, masa: 100g.", category1);
        Product product2 = new Product("Mars", 4, "Baton z karmelem, masa 47g.", category1);
        Product product3 = new Product("Olmeca Gold", 100, "Tequila, pojemność: 0,7L, alkohol: 38%.",
                category2);
        Product product4 = new Product("Zeszyt", 8, "Zeszyt A5, w kratkę, str. 60.");

        product1.showProductWithCategory();
        System.out.println();

        product2.showProductWithCategory();
        System.out.println();

        product3.showProductWithCategory();
        System.out.println();

        product4.showProductWithoutCategory();
        System.out.println();

        SpecialOffer specialOffer1 = new SpecialOffer("Rabat: 20%", ", ważny 09.10.2020r. - 16.102020r.",
                0.2, product3);
        specialOffer1.discountValue();
        specialOffer1.showSpecialOffer();
        product3.showProductWithCategory();
    }
}
