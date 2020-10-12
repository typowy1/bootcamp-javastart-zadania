package lekcja4_zadanie2_pola_figur;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    double calculatePerimeter() {
        return 2 * getSideA() + 2 * getSideB();
    }
}
