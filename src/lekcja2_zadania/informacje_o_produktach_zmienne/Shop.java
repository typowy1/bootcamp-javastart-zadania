package lekcja2_zadania.informacje_o_produktach_zmienne;

public class Shop {
    public static void main(String[] args) {

        Product firstProduct = new Product();
        firstProduct.firstProductName = "Mleko";
        firstProduct.firstProductProducer = "Mlekowita";
        firstProduct.firstProductPrice = 2.5;

        Product secondProduct = new Product();
        secondProduct.secondProductName = "Czekolada";
        secondProduct.secondProductProducer = "Wedel";
        secondProduct.secondProductPrice = 2.19;

        System.out.println(firstProduct.firstProductName + " " + firstProduct.firstProductProducer + " "
                + firstProduct.firstProductPrice + "zł");
        System.out.println(secondProduct.secondProductName + " " + secondProduct.secondProductProducer + " "
                + secondProduct.secondProductPrice + "zł");
    }
}