package lekcja12_zadanie1_dzialania_matematyczne;

public class Numbers {

    private double a;
    private double b;
    private String mathSymbol;

    public Numbers(double a, double b, String mathSymbol) {
        this.a = a;
        this.b = b;
        this.mathSymbol = mathSymbol;
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

    public String getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(String mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    @Override
    public String toString() {
        return a + mathSymbol + b;
    }

    public String toTxt() {
        return a + " " + mathSymbol + " " + b;
    }
}
