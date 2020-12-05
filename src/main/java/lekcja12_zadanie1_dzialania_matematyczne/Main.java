package lekcja12_zadanie1_dzialania_matematyczne;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            Numbers[] numbers = NumbersUtils.read("operations.txt");
            NumbersUtils.printMathematicalOperationsInfo(numbers);
            NumbersUtils.save(numbers, "results.txt");
        } catch (IOException e) {
            System.err.println("Brak wskazanego pliku");
            e.printStackTrace();
        }
    }
}
