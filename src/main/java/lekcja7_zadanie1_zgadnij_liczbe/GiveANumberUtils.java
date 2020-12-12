package lekcja7_zadanie1_zgadnij_liczbe;

import java.util.Scanner;

public class GiveANumberUtils {

    public void findNumber(int from, int to, int divisibleBy) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("Podaj liczbę");
            inputNumber = scanner.nextInt();
            if (inputNumber < from) {
                System.out.println("Podana Liczba jest za mała");
            } else if (inputNumber > to) {
                System.out.println("Podana liczba jest za duża");
            } else if (inputNumber % divisibleBy != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } while (inputNumber < from || inputNumber > to || inputNumber % divisibleBy != 0);
        System.out.println("Liczba jest ok");
        scanner.close();
    }
}
