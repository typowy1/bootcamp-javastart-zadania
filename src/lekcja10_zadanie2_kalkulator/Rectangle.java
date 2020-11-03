package lekcja10_zadanie2_kalkulator;

public class Rectangle extends GeometricShape {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokąt{" + "a=" + a + ", b=" + b + '}';
    }
}
