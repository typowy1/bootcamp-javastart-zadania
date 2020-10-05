package lekcja2_zadania.drink;

public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Woo Woo";
        drink1.price = 30;
        drink1.includesAlcohol = true;

        drink1.firstIngredients = new Ingredients();
        drink1.firstIngredients.ingredientsName = "Peach schnapps";
        drink1.firstIngredients.ingredientsQuantity = 0.025;
        drink1.secondIngredients = new Ingredients();
        drink1.secondIngredients.ingredientsName = "Vodka";
        drink1.secondIngredients.ingredientsQuantity = 0.025;
        drink1.thirdIngredients = new Ingredients();
        drink1.thirdIngredients.ingredientsName = "Cranberry juice";
        drink1.thirdIngredients.ingredientsQuantity = 0.050;

        System.out.println("Drink: " + drink1.name + ",price: " + drink1.price + "zł" + ", includes alcohol: "
                + drink1.includesAlcohol);
        System.out.println("Ingredients:");
        System.out.println("First ingredient: " + drink1.firstIngredients.ingredientsName + ", quantity: "
                + drink1.firstIngredients.ingredientsQuantity + "L");
        System.out.println("Second ingredient: " + drink1.secondIngredients.ingredientsName + ", quantity: "
                + drink1.secondIngredients.ingredientsQuantity + "L");
        System.out.println("Third ingredient: " + drink1.thirdIngredients.ingredientsName + ", quantity: "
                + drink1.thirdIngredients.ingredientsQuantity + "L");

        double drinkCapacity = drink1.firstIngredients.ingredientsQuantity + drink1.secondIngredients.ingredientsQuantity
                + drink1.thirdIngredients.ingredientsQuantity;

        System.out.println("Drink capacity: " + drink1.firstIngredients.ingredientsName + " = " + drinkCapacity + "L");
    }

}