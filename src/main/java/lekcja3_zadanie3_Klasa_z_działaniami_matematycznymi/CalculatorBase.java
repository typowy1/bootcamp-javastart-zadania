package lekcja3_zadanie3_Klasa_z_działaniami_matematycznymi;

public class CalculatorBase {

    boolean isEven(int a) {
        return a % 2 == 0;
    }

    boolean isOdd(int a) {
        return a % 2 == 1;
    }

    double circleField(double a) {
        double result = (a * a * 3.141592653589793);
        return result;
    }

    int power(int a) {
        return a * a;
    }
}
