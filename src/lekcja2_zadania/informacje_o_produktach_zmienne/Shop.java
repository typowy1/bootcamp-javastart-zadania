package lekcja2_zadania.informacje_o_produktach_zmienne;

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        product.firstProductName = "Mleko";
        product.firstProductProducer = "Mlekowita";
        product.firstProductPrice = 2.5;

        product.secondProductName = "Czekolada";
        product.secondProductProducer = "Wedel";
        product.secondProductPrice = 2.19;

        System.out.println(product.firstProductName + " " + product.firstProductProducer + " "
                + product.firstProductPrice + "zł");
        System.out.println(product.secondProductName + " " + product.secondProductProducer + " "
                + product.secondProductPrice + "zł");
    }
}