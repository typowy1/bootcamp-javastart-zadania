package lekcja18.zadanie1_ciąg_fibonacciego;

public class Euler2 {

    int getEvenNumbersFromFibonacciSequence(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum;
        int result = 0;
        int numbersMaxLimit = 4000000;
        int numbersMinLimit = 0;
        if (limit > numbersMaxLimit || limit < 0) {
            throw new IllegalArgumentException("Liczba jest większa niż " + numbersMaxLimit
                    + " lub mniejsza niż " + numbersMinLimit);
        } else {
            while (firstNumber < limit) {
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                if (sum % 2 == 0) {
                    result += sum;
                }
            }
            return result;
        }
    }
}
