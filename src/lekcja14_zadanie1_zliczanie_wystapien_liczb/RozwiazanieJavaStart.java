package lekcja14_zadanie1_zliczanie_wystapien_liczb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RozwiazanieJavaStart {

    public static void main(String[] args) {
        try {
            List<Integer> allNumbers = readNumbersFromFile("liczby.txt");
            printOccurencesUnique(allNumbers);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku liczby.txt");
        }
    }

    private static void printOccurencesUnique(List<Integer> allNumbers) {
        Set<Integer> uniqueNumbers = new TreeSet<>(allNumbers);
        for (Integer number : uniqueNumbers) {
            //wersja 1
//            System.out.println(number + " - liczba wystąpień " + countOccurences(number, allNumbers));
            //wersja 2
            System.out.println(number + " - liczba wystąpień " + Collections.frequency(allNumbers, number));
        }
    }

    //wersja 1
//    private static int countOccurences(int number, List<Integer> allNumbers) {
//        int occurences = 0;
//        for (Integer n : allNumbers) {
//            if (number == n)
//                occurences++;
//        }
//        return occurences;
//    }

    private static List<Integer> readNumbersFromFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        List<Integer> result = new ArrayList<>();
        while (scan.hasNextInt()) {
            int next = scan.nextInt();
            result.add(next);
        }
        return result;
    }
}
