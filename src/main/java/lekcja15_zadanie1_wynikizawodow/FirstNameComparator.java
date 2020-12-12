package lekcja15_zadanie1_wynikizawodow;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player1.getFirstName().compareTo(player2.getFirstName());
    }
}
