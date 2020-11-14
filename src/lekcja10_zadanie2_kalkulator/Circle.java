package lekcja10_zadanie2_kalkulator;

public class Circle extends GeometricShape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Koło{" + "r=" + r + '}';
    }
}
