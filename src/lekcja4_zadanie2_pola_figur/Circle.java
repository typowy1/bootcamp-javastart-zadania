package lekcja4_zadanie2_pola_figur;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
