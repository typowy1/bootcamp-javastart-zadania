package lekcja2_zadania.informacje_o_produktach_zmienne;

public class Shop {
    public static void main(String[] args) {

        Product firstProduct = new Product();
        firstProduct.productName = "Mleko";
        firstProduct.producer = "Mlekowita";
        firstProduct.price = 2.5;

        Product secondProduct = new Product();
        secondProduct.productName = "Czekolada";
        secondProduct.producer = "Wedel";
        secondProduct.price = 2.19;

        System.out.println(firstProduct.productName + " " + firstProduct.producer + " " + firstProduct.price + "zł");
        System.out.println(secondProduct.productName + " " + secondProduct.producer + " " + secondProduct.price + "zł");
    }
}