package lekcja6_zadanie3_cena_brutto_produktu;

import java.util.Scanner;

public class ProductUtils {

    Scanner scanner = new Scanner(System.in);

    public Product[] enterProducts() {

        int productsQuantity = enterProductsQuantity();
        Product[] product = new Product[productsQuantity];

        for (int i = 0; i < product.length; i++) {
            System.out.println("Podaj nazwę produktu " + (i + 1));
            String productName = scanner.nextLine();

            System.out.println("Podaj opis produktu " + (i + 1));
            String productDescription = scanner.nextLine();

            System.out.println("Podaj cenę produktu " + (i + 1));
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
