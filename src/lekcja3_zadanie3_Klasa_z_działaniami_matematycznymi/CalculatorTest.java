package lekcja3_zadanie3_Klasa_z_działaniami_matematycznymi;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorBase calculator1 = new CalculatorBase();
        boolean even = calculator1.isEven(4);
        System.out.println("Czy to jest liczba parzysta: " + even);

        boolean odd = calculator1.isOdd(4);
        System.out.println("Czy to jest liczba nieparzysta: " + odd);

        double circircleField = calculator1.circleField(9.5);
        System.out.println("Promień koła: " + circircleField);

        int power = calculator1.power(6);
        System.out.println("Wynik liczby do kwadratu wynosi: " + power);
    }
}
