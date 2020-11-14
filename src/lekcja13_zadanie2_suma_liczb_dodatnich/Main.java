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
        int max = -1;
        for (Integer number : numbers) {
            if(number > max)
                max = number;
        }
        return max;
    }

    private static int findMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if(number < min)
                min = number;
        }
        return min;
    }

    private static void printListSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if(i < numbers.size() - 1)
                System.out.print(numbers.get(i) + " + ");
            else
                System.out.print(numbers.get(i) + " = ");
        }
        System.out.println(sum);
    }

    private static void printReverseList(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();
    }

    //wczytasz od użytkownika dowolną ilość liczb dodatnich.
    //Wprowadzanie liczb powinno się zakończyć, gdy użytkownik poda pierwszą liczbę ujemną (liczba ta NIE powinna być dodana do listy).
    private static List<Integer> createList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int number;
        do {
            System.out.println("Podaj liczbę nieujemną");
            number = scan.nextInt();
            if(number >= 0)
                result.add(number); // nie trzeba else ponieważ system zaończy działanie i wyjdzie z pętli jak number >= 0
            // warunek nie będzie spałniony
        } while (number >= 0);
        return result;
    }
}
