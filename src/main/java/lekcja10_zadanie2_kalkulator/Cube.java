package lekcja10_zadanie2_kalkulator;

public class Cube extends Shape3D {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Sześcian{" + "a=" + a + '}';
    }
}
