package lekcja7_zadanie2_suma_kwadratow;

import java.util.Arrays;
import java.util.Scanner;

public class LoadNumbersUtils {

    Scanner scanner = new Scanner(System.in);

    double[] createArray() {
        scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int arraySize = scanner.nextInt();
        double[] array = new double[arraySize];
        return array;
    }

    void completeTheArray(double[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println("Wprowadź " + (i + 1) + " wartosć do tablicy!");
            array[i] = scanner.nextInt();
        }
        showArrayInfo(array);
        scanner.close();
    }

    private void showArrayInfo(double[] array) {
        System.out.println("Rozmiar tablicy wybrany przez ciebie to: " + array.length
                + ", liczby wprowadzone przez ciebie do tablicy to: " + Arrays.toString(array));
    }

    double getSumSquaresFromArray(double[] array) {
        double sum = 0;
        for (double number : array) {

            sum += Math.pow(number, 2);
        }
        return sum;
    }

    void showSumSquaresInfoFromArray(double sum) {
        System.out.println("Suma kwadratów liczb z tablicy wynosi: " + sum);
    }
}
