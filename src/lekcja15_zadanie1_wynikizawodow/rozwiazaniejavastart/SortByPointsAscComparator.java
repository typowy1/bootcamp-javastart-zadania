package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

import java.util.Comparator;

public class SortByPointsAscComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getPoints(), o2.getPoints());
    }

}
