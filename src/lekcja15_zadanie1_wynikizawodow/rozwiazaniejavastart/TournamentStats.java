package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TournamentStats {

    private static final int SORT_BY_NAME = 1;
    private static final int SORT_BY_SURNAME = 2;
    private static final int SORT_BY_POINTS = 3;

    private static final int SORT_DESC = 2;

    void run(Scanner scanner) {
        // tutaj dodaj swoje rozwiązanie
        // użyj przekazanego scannera do wczytywania wartości
        List<Player> players = readPlayers(scanner);
        SortOrder sortOrder = readSortOrder(scanner);
        sortPlayerList(players, sortOrder);
        writeToStatsFile(players);
    }

    private void writeToStatsFile(List<Player> players) {
        List<String> linesToWrite = new ArrayList<>();
        for (Player player : players) {
            String playerAsString = String.format("%s %s;%d", player.getName(), player.getSurname(), player.getPoints());
            linesToWrite.add(playerAsString);
        }

        try {
            Files.write(Path.of("stats.csv"), linesToWrite);
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
        }
    }

    private SortOrder readSortOrder(Scanner scanner) {
        System.out.println("Po jakim parametrze posortować? (1 - imię, 2 - nazwisko, 3 - wynik)");
        int sortBy = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sortować rosnąco czy malejąco? (1 - rosnąco, 2 - malejąco)");
        int order = scanner.nextInt();
        scanner.nextLine();
        SortOrder sortOrder = new SortOrder(sortBy, order);
        return sortOrder;
    }

    private void sortPlayerList(List<Player> players, SortOrder sortOrder) {

        Comparator<Player> nameComparator = new SortByNameAscComparator();
        Comparator<Player> surnameComparator = new SortBySurnameAscComparator();
        Comparator<Player> pointsComparator = new SortByPointsAscComparator();

        if (sortOrder.getSortOrder() == SORT_DESC) {
            nameComparator = nameComparator.reversed();
            surnameComparator = surnameComparator.reversed();
            pointsComparator = pointsComparator.reversed();
        }

        switch (sortOrder.getSortBy()) {
            case SORT_BY_NAME:
                players.sort(nameComparator);
                break;
            case SORT_BY_SURNAME:
                players.sort(surnameComparator);
                break;
            case SORT_BY_POINTS:
                players.sort(pointsComparator);
                break;
            default:
                throw new IllegalArgumentException("Sort by: " + sortOrder.getSortBy() + " not supported");
        }
    }

    private List<Player> readPlayers(Scanner scanner) {
        List<Player> players = new ArrayList<>();

        while (true) {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            String playerData = scanner.nextLine();

            if (playerData.equalsIgnoreCase("STOP")) {
                break;
            }

            String[] split = playerData.split(" ");
            if (split.length != 3) {
                System.out.println("Nieprawidłowe dane");
                continue;
            }

            int points;
            try {
                points = Integer.parseInt(split[2]);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowe dane");
                continue;
            }

            Player player = new Player(split[0], split[1], points);
            players.add(player);
        }
        return players;
    }
}
