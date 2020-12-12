package lekcja15_zadanie1_wynikizawodow;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return Integer.compare(player1.getScore(), player2.getScore());
    }
}
