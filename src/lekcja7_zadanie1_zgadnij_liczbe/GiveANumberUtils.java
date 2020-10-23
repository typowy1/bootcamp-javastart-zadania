package lekcja7_zadanie1_zgadnij_liczbe;

import java.util.Scanner;

public class GiveANumberUtils {

    public void findNumber(int from, int to, int divisibleBy) {
        Scanner scanner = new Scanner(System.in);
        int numberInput;

        do {
            System.out.println("Podaj liczbę");
            numberInput = scanner.nextInt();
            if (numberInput < from) {
                System.out.println("Podana Liczba jest za mała");
            } else if (numberInput > to) {
                System.out.println("Podana liczba jest za duża");
            } else if (numberInput % divisibleBy != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } while (numberInput < from || numberInput > to || numberInput % divisibleBy != 0);
        System.out.println("Liczba jest ok");
        scanner.close();
    }
}
