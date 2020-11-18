package lekcja14_zadanie2_kody_krajów.rozwiązanie;
import lekcja14_zadanie2_kody_krajów.Country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryDatabase {

    private final Map<String, Country> countryMap;// pole mapy, inicjalizacja(utworzenie) mapy może też być tu
//    private final Map<String, Country> countryMap1 = new HashMap<>(); - w tym wypadku nie trzeba tworzyc konstruktora

    public CountryDatabase() {
        countryMap = new HashMap<>();// operuje na polu klasy, tak jest czyściej i podobno lepiej, automatycznie tworzy mape przy wywołaniu
    }

    void run() {
        try {
            readFileToMap();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv.");
            return;
        }

        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        Scanner scanner = new Scanner(System.in);
        String countryCode = scanner.nextLine();
        Country country = countryMap.get(countryCode);
        if (country != null) {
            System.out.printf("%s (%s) ma %d ludności.", countryCode, country.getName(), country.getPopulation());
        } else {
            System.out.printf("Kod kraju %s nie został znaleziony.", countryCode);
        }
        scanner.close();

    }

    private void readFileToMap() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("countries.csv"));) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] split = line.split(";");
                String code = split[0];
                String name = split[1];
                int population = Integer.parseInt(split[2]);

                Country country = new Country(code, name, population);
                countryMap.put(code, country);
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku.");
        }
    }
}
