package lekcja2_zadania.drink;

public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Woo Woo";
        drink1.price = 30;
        drink1.includesAlcohol = true;
        drink1.ingredients1.ingredientsName = "Peach schnapps";
        drink1.ingredients1.ingredientsQuantity = 0.025;
        drink1.ingredients2.ingredientsName = "Vodka";
        drink1.ingredients2.ingredientsQuantity = 0.025;
        drink1.ingredients3.ingredientsName = "Cranberry juice";
        drink1.ingredients3.ingredientsQuantity = 0.050;

        System.out.println("Drink: " + drink1.name + ",price: " + drink1.price + "zł" + ", includes alcohol: "
                + drink1.includesAlcohol);
        System.out.println("Ingredients:");
        System.out.println("First ingredient: " + drink1.ingredients1.ingredientsName + ", quantity: "
                + drink1.ingredients1.ingredientsQuantity + "L");
        System.out.println("Second ingredient: " + drink1.ingredients2.ingredientsName + ", quantity: "
                + drink1.ingredients2.ingredientsQuantity + "L");
        System.out.println("Third ingredient: " + drink1.ingredients3.ingredientsName + ", quantity: "
                + drink1.ingredients3.ingredientsQuantity + "L");

        double drinkCapacity = drink1.ingredients1.ingredientsQuantity + drink1.ingredients2.ingredientsQuantity
                + drink1.ingredients3.ingredientsQuantity;

        System.out.println("Drink capacity: " + drink1.ingredients1.ingredientsName + " = " + drinkCapacity + "L");
    }
}
