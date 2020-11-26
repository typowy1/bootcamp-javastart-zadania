package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TournamentStats tournamentStats = new TournamentStats();
        Scanner scanner = new Scanner(System.in);
        tournamentStats.run(scanner);
    }
}
