package lekcja12_zadanie1_dzialania_matematyczne;

import java.io.*;
import java.util.Scanner;

public class NumbersUtils {

    public static void save(Numbers[] numbers, String resultsFile) {

        try (var writer = new BufferedWriter(new FileWriter(resultsFile))) {
            for (int i = 0; i < numbers.length; i++) {
                writer.write(numbers[i].toTxt() + " = " + mathematicalOperations(numbers[i]));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + resultsFile);
        }

    }

    public static Numbers[] read(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Numbers[] result = new Numbers[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            double a = Double.parseDouble(split[0]);
            String mathSymbol = split[1];
            double b = Double.parseDouble(split[2]);
            result[i] = new Numbers(a, b, mathSymbol);
        }
        return result;
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double mathematicalOperations(Numbers number) {
        if (number.getMathSymbol().equals("+")) {
            return add(number.getA(), number.getB());
        } else if (number.getMathSymbol().equals("-")) {
            return subtract(number.getA(), number.getB());
        } else if (number.getMathSymbol().equals("*")) {
            return multiply(number.getA(), number.getB());
        } else {
            return division(number.getA(), number.getB());
        }
    }

    public static void printMathematicalOperationsInfo(Numbers[] numbers) {
        for (Numbers number : numbers) {
            System.out.println(number.toTxt() + " = " + mathematicalOperations(number));
        }
    }
}
