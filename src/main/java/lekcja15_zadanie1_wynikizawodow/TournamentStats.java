package lekcja15_zadanie1_wynikizawodow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TournamentStats {

    private final List<Player> players;

    public static final String STOP = "stop";
    public static final int FIRST_NAME = 1;
    public static final int LAST_NAME = 2;
    public static final int SCORE = 3;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    public static final String FILE_NAME = "stats.csv";

    public TournamentStats() {
        players = new ArrayList<>();
    }

    void run(Scanner scanner) {

        takeDataFromUser(scanner);
        Comparator<Player> comparator = null;
        try {
            comparator = getPlayerComparator(scanner);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        players.sort(comparator);
        saveData();
    }

    private Comparator<Player> getPlayerComparator(Scanner scanner) {
        if (players.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Brak wprowadzonych graczy!");
        }
        System.out.println("Po jakim parametrze posortować? (1 - imię, 2 - nazwisko, 3 - wynik)");
        int input = scanner.nextInt();
        Comparator<Player> comparator = null;
        switch (input) {
            case FIRST_NAME:
                comparator = chosenComparator(new FirstNameComparator(), scanner);
                break;
            case LAST_NAME:
                comparator = chosenComparator(new LastNameComparator(), scanner);
                break;
            case SCORE:
                comparator = chosenComparator(new ScoreComparator(), scanner);
                break;
            default:
                System.out.println("Błędne kryterium sortowania");
                System.exit(0);
        }
        return comparator;
    }

    private Comparator<Player> chosenComparator(Comparator<Player> comparator, Scanner scanner) {
        System.out.println("Sortować rosnąco czy malejąco? (1 - rosnąco, 2 - malejąco)");
        int input = scanner.nextInt();
        Comparator<Player> comparator1 = null;
        switch (input) {
            case ASCENDING:
                comparator1 = comparator;
                break;
            case DESCENDING:
                comparator1 = comparator.reversed();
                break;
            default:
                System.out.println("Błędne kryterium sortowania");
                System.exit(0);
        }
        return comparator1;
    }

    private void takeDataFromUser(Scanner scanner) {
        String input;
        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop)");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase(STOP)) {
                break;
            } else {
                try {
                    String[] split = input.split(" ");
                    String firstName = split[0];
                    String lastName = split[1];
                    int score = Integer.parseInt(split[2]);
                    players.add(new Player(firstName, lastName, score));

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Podałeś złe dane, podaj: imię nazwisko wynik!");
                } catch (NumberFormatException e) {
                    System.out.println("Podałeś złe dane w wyniku, podaj: liczbę!");
                }
            }
        } while (true);
    }

    private void saveData() {
        try (var writer = new BufferedWriter(new FileWriter(TournamentStats.FILE_NAME))) {
            for (int i = 0; i < players.size(); i++) {
                writer.write(players.get(i).toCsv());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku: " + FILE_NAME);
        }
        System.out.println("Dane posortowano i zapisano do pliku " + FILE_NAME + ".");
    }
}
