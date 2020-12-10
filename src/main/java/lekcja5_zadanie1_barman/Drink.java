package lekcja5_zadanie1_barman;

public class Drink {

    private String name;
    private double price;
    private boolean includesAlcohol;

    public Drink(String name, double price, boolean includesAlcohol) {
        this.name = name;
        this.price = price;
        this.includesAlcohol = includesAlcohol;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIncludesAlcohol() {
        return includesAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIncludesAlcohol(boolean includesAlcohol) {
        this.includesAlcohol = includesAlcohol;
    }
}
