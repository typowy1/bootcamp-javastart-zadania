package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

import java.util.Comparator;

public class SortByNameAscComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
