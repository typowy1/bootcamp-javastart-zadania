package lekcja12_zadanie2_statystyki_firmy;

import java.io.*;
import java.util.Scanner;

public class EmployeeUtils {

    public static void save(Employee[] employees, String statsFileName) {

        File stats = new File(statsFileName);
        boolean fileExists = stats.exists();
        if (!fileExists) {
            try {
                fileExists = stats.createNewFile();
            } catch (IOException e) {
                System.err.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists) {
            try (var writer = new BufferedWriter(new FileWriter(stats))) {
                double averagePayout = averagePayout(employees);
                double lowestPayout = lowestPayout(employees);
                double highestPayout = highestPayout(employees);
                int itDepartment = countDepartments(employees, "IT");
                int supportDepartment = countDepartments(employees, "Support");
                int managementDepartment = countDepartments(employees, "Management");
                writer.write("Średnia wypłata: " + averagePayout);
                writer.newLine();
                writer.write("Minimalna wypłata: " + lowestPayout);
                writer.newLine();
                writer.write("Maxymalna wypłata: " + highestPayout);
                writer.newLine();
                writer.write("Liczba pracowników IT: " + itDepartment);
                writer.newLine();
                writer.write("Liczba pracowników Support: " + supportDepartment);
                writer.newLine();
                writer.write("Liczba pracowników Management: " + managementDepartment);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Employee[] read(File fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(fileName);
        int lines = countLines(fileName);
        Employee[] result = new Employee[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            double salary = Double.parseDouble(split[4]);
            result[i] = new Employee(split[0], split[1], split[2], split[3], salary);
        }
        return result;
    }

    private static int countLines(File fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(fileName);
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }

    public static double averagePayout(Employee[] employees) {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].getSalary();
        }
        return result / employees.length;
    }

    public static double lowestPayout(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (result > employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return result;
    }

    public static double highestPayout(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (result < employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return result;
    }

    private static int countDepartments(Employee[] employees, String department) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }

    public static void printStatisticsInfo(Employee[] employees) {
        double averagePayout = EmployeeUtils.averagePayout(employees);
        double lowestPayout = EmployeeUtils.lowestPayout(employees);
        double highestPayout = EmployeeUtils.highestPayout(employees);
        int itDepartment = countDepartments(employees, "IT");
        int supportDepartment = countDepartments(employees, "Support");
        int managementDepartment = countDepartments(employees, "Management");
        System.out.println("Średnia wypłata: " + averagePayout);
        System.out.println("Minimalna wypłata: " + lowestPayout);
        System.out.println("Maxymalna wypłata: " + highestPayout);
        System.out.println("Liczba pracowników IT: " + itDepartment);
        System.out.println("Liczba pracowników Support: " + supportDepartment);
        System.out.println("Liczba pracowników Management: " + managementDepartment);
    }
}
