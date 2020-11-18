package lekcja14_zadanie2_kody_krajów;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryUtils {

    public static Map<String, Country> readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        Map<String, Country> countryMap = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            countryMap.put(split[0], new Country(split[0], split[1], Integer.parseInt(split[2])));
        }
        scanner.close();
        return countryMap;
    }

    public static void takeCountryCodeFromUser(Map<String, Country> countryMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String code = scanner.nextLine();
        scanner.close();
        boolean containsKey = countryMap.containsKey(code);
        if (containsKey) {
            Country country = countryMap.get(code);
            System.out.println(country);
        } else {
            throw new IllegalArgumentException("Kod kraju " + code + " nie został znaleziony.");
        }
        scanner.close();
    }
}
