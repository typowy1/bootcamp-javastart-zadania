package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

import java.util.Comparator;

public class SortByNameDescComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
