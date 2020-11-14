package lekcja5_zadanie3_rok_przestępny;

public class YearCheck {
    boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
