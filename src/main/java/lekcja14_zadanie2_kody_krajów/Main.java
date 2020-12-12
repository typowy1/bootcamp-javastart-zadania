package lekcja14_zadanie2_kody_krajów;

import lekcja14_zadanie2_kody_krajów.rozwiązanie.CountryDatabase;

import java.io.FileNotFoundException;
import java.util.Map;

public class Main {

    public static final String FILE_NAME = "countries.csv";

    public static void main(String[] args) {

        try {
            //spójż rozwiązanie w package rozwiązanie!!!

            Map<String, Country> countryMap = CountryUtils.readFile(FILE_NAME);
           // Map<String, Country> countryMap = new CountryUtils().readFile(FILE_NAME); obiektowe podejście bez metod statycznych
            CountryUtils.takeCountryCodeFromUser(countryMap);
           // new CountryUtils().takeCountryCodeFromUser(countryMap); obiektowe podejście bez metod statycznych
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku " + FILE_NAME + ".");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
