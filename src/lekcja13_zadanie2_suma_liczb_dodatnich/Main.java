package lekcja13_zadanie2_suma_liczb_dodatnich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = createList();
        printReverseList(numbers);
        printListSum(numbers);
        int min = findMin(numbers);
        System.out.println("Najmniejsza liczba w liście to " + min);
        int max = findMax(numbers);
        System.out.println("Największa liczba w liście to " + max);
    }

    private static int findMax(List<Integer> numbers) {
        // int max = - 1; // przypisujemy liczbe mniejszą od 0, - 1 jest nie poprawna i kazde liczba z tej listy będzie od neij większa
        int max = numbers.get(0); // możemy założyć że pierwsza liczba w liście jest tą największą lub jak wyzej
        for (Integer number : numbers) {
            if (number > max)// jezeli kolejna liczba z listy jest wieksza od tej najwiekszej to je podmieniamy i przypisujemy ja do max
                max = number;
        }
        return max;
    }

    private static int findMin(List<Integer> numbers) {
        int min = numbers.get(0); // najmmniejsza możliwa liczba na liscie, przyjmijmy ze bedzie to pierwsza na naiej zapisana
        for (Integer number : numbers) {
            if (number < min) // jezeli kolejna liczba z listy jest mniejsza od min to podmieniamy wartosci i przypisujemy ja do do min
                min = number;
        }
        return min;
    }

    //oblicz sumę i ją wyświetl w postaci a + b + c + …= x, gdzie a, b, c to liczby wprowadzone przez użytkownika a x to obliczona suma,
    private static void printListSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i); //  do sumy dodajemy kolejne liczby z listy
            if (i < numbers.size() - 1) {// mając liczby 1, 2, 3 czyli tu dochodzimy do 2 i dodajemy +
                // jezeli indeks jest mniejszy od ostatniego poprawnego indeksu listy to wyświetlam kolejną liczbę i doklejam znak plusa 1 + 2 +
                System.out.print(numbers.get(i) + " + ");
            } else {// natomiast to z listy liczb 1,2,3 dojdziemy do odtatniej liczby czyli 3 i wstawimy równa sie wyjdzie nam 1 + 2 + 3 =
                System.out.print(numbers.get(i) + " = ");
            }
        }
        System.out.println(sum); //a tu wyjdzie na 1 + 2 +3 =

//        tutaj mamy warunek i < numbers.size() - 1 który jest prawdziwy dla wszystkich elementów listy oprócz ostatniego.
//                Więc ta linijka  System.out.print(numbers.get(i) + " + ");  wykona sie dla wszystkich elementów oprócz ostatniego.
//                Za to ra linijka System.out.print(numbers.get(i) + " = "); wykona się tylko dla ostatniego elementu.
    }

    //wyświetl je w kolejności odwrotnej niż były wprowadzone,
    private static void printReverseList(List<Integer> numbers) {
        // przejdzie po elementach w odwrotnej kolejnosci, czyli zaczniemy od wielkosci tablicy a nie od 0 i odejmujemy 1,
        // iterujemy do 0 i dekrementujemy czyli - 1, jak tego nie zrobimy wyjdziemy poza rozmiar listy
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i));// po kazdej liczbie przecinek i spacja
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print("");
            }
        }
        System.out.println();// zeby wynik był w kolejnym wierszu
    }

//    zaczyna się od ostatniego elementu i "przechodzi" przez elementy do pierwszego elementu listy
//    jesli chodzi o przecinek na koncu to musisz dodać podobny warunek jak przy printListSum do petli:

    //wczytasz od użytkownika dowolną ilość liczb dodatnich.
    //Wprowadzanie liczb powinno się zakończyć, gdy użytkownik poda pierwszą liczbę ujemną (liczba ta NIE powinna być dodana do listy).
    private static List<Integer> createList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int number;
        do {
            System.out.println("Podaj liczbę nieujemną");
            number = scan.nextInt();
            if (number >= 0)
                result.add(number); // nie trzeba else ponieważ system zaończy działanie i wyjdzie z pętli jak number >= 0
            // warunek nie będzie spałniony
        } while (number >= 0);
        return result;
    }
}
