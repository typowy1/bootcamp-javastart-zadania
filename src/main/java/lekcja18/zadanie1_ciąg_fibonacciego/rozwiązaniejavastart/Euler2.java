package lekcja18.zadanie1_ciąg_fibonacciego.rozwiązaniejavastart;

public class Euler2 {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int result = euler2.calculateSum(4_000_000);
        System.out.println("Result: " + result);
    }

    int calculateSum(int limit) {
        int previous = 1;
        int previous2 = 2;
        int sum = 0;

        while (previous2 <= limit) {
            int nextValue = previous + previous2;

            if (previous2 % 2 == 0) {
                sum += previous2;
            }
            previous = previous2;
            previous2 = nextValue;
        }

        return sum;
    }
}
