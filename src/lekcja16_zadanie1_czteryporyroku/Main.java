package lekcja16_zadanie1_czteryporyroku;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        printSeasonsList();
        String input = getUserInput();
        Season season = Season.getSeasonFromUserChoice(input);
        printSeasonFromUserChoice(season);
    }

    private static void printSeasonFromUserChoice(Season season) {
        System.out.println(Arrays.asList(season.getMonths()));
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    private static void printSeasonsList() {
        Season[] seasons = Season.values();
        System.out.println("Podaj porę roku:");
        for (Season season : seasons) {
            System.out.println(season.getPlName());
        }
    }
}
