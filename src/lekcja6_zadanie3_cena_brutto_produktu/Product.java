package lekcja6_zadanie3_cena_brutto_produktu;

import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String description;
    private double netPrice;
    private String category;
    private Product[] product;


    public Product[] getProduct() {
        return product;
    }

    public Product getProductFromArray(int index) {
        return product[index];
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Product() {
    }

    public Product(String name, String description, double netPrice, String category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product[] enterProducts() {

        int productsQuantity = enterProductsQuantity();
        product = new Product[productsQuantity];

        for (int i = 0; i < product.length; i++) {
            System.out.println("Podaj nazwę produktu: " + (i + 1));
            String productName = scanner.nextLine();

            System.out.println("Podaj opis produktu: " + (i + 1));
            String productDescription = scanner.nextLine();

            System.out.println("Podaj cenę produktu: " + (i + 1));
            int productPrice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Podaj kategorię produktu z podanych - Napoje, Słodycze, Alkohol: " + (i + 1));
            String productCategory = scanner.nextLine();

            product[i] = new Product(productName, productDescription, productPrice, productCategory);
        }
        return product;
    }

    private int enterProductsQuantity() {

        System.out.println("Podaj ilość produktów do wprowadzenia:");
        int productsQuantity = scanner.nextInt();
        scanner.nextLine();
        return productsQuantity;
    }
}
