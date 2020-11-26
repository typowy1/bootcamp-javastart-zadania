package lekcja14_zadanie1_zliczanie_wystapien_liczb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static final String FILE_NAME = "liczby.txt";

    public static void main(String[] args) {

        try {
            printNumbersStatsFromFile(FILE_NAME);
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku: " + FILE_NAME);
        }
    }

    private static void printNumbersStatsFromFile(String fileName) throws FileNotFoundException {
        List<Integer> numbers = readFile(fileName);// ja tu wstawiłem liste, rozwiązenie w metodzie main
        Set<Integer> selectedNumbers = new TreeSet<>(numbers);
        for (Integer number : selectedNumbers) {
            //wersja 1
//            System.out.println(number + " - liczba wystąpień " + countOccurences(number, mumbers));bieże dany numer i sprawdza ilość wystapień w kolekcji (numer, kolekcja)
            //wersja 2
            System.out.println(number + " - liczba wystąpień " + Collections.frequency(numbers, number));// z kolekcji zlicza ilość wystąpień obiektu, (kolekcja, numer)
            Collections.sort(numbers);
//            You could convert the actual list to a unique item list(tutaj set) and after that, you could use the method Collections.
//                    frequency to know how many time the same element appears in the list.
            //https://www.geeksforgeeks.org/java-util-collections-frequency-java/
            //https://www.codota.com/code/java/methods/java.util.Collections/frequency
        }
    }

    private static List<Integer> readFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            int line = scanner.nextInt();
            numbers.add(line);
        }
        scanner.close();
        return numbers;
    }

//        private static int countOccurences(int number, List<Integer> numbers) { bieże dany numer i sprawdza ilość wystapień w kolekcji
//        int occurences = 0;
//        for (Integer n : allNumbers) {
//            if (number == n)
//                occurences++;
//        }
//        return occurences;
//    }
}
