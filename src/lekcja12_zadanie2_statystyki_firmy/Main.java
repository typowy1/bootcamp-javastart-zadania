package lekcja12_zadanie2_statystyki_firmy;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("employees.csv");
        Employee[] employees = EmployeeUtils.read(file);

        EmployeeUtils.printStatisticsInfo(employees);
        EmployeeUtils.save(employees, "stats.txt");
    }
}
