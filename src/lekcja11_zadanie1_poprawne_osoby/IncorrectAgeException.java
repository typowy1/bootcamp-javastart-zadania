package lekcja11_zadanie1_poprawne_osoby;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(String message) {
        super(message);
    }
}
