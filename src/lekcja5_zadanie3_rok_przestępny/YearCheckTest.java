package lekcja5_zadanie3_rok_przestępny;

public class YearCheckTest {
    public static void main(String[] args) {
        YearCheck leapYear = new YearCheck();
        System.out.println("Rok przestępny: " + leapYear.isLeap(2020));
    }
}
