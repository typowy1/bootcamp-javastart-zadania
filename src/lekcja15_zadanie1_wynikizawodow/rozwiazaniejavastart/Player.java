package lekcja15_zadanie1_wynikizawodow.rozwiazaniejavastart;

public class Player {

    private String name;
    private String surname;
    private int points;

    public Player(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }
}
