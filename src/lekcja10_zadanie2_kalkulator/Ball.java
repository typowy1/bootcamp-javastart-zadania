package lekcja10_zadanie2_kalkulator;

public class Ball extends Shape3D {
    private double r;

    public Ball(double r) {
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
        return "Kula{" + "r=" + r + '}';
    }
}
