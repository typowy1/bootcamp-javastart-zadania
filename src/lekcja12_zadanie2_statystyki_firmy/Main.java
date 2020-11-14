package lekcja12_zadanie2_statystyki_firmy;

import java.io.File;
import java.io.IOException;

import static lekcja12_zadanie2_statystyki_firmy.EmployeeUtils.*;
import static lekcja12_zadanie2_statystyki_firmy.EmployeeUtils.save1;

public class Main {

    public static void main(String[] args) throws IOException {

        //musiałem dac statyczne importy bo jakies błędy wyskoczyły po skopiowaniu klasy z repo

        File file = new File("employees.csv");
        Employee[] employees = read1(file);

        printStatisticsInfo(employees);
        save1(employees, "stats.txt");
    }
}
