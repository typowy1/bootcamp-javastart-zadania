package lekcja20_listaidodawanieuzytkownikow;

import java.util.ArrayList;
import java.util.List;

//@Repository to można dodać jak używamy springa
public class UserRepository {

    //Repozytorium dla userów
    private List<User> users; // pole listy userow

    // tworze konstruktor w którym dodam kilku użytkowników do listy

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User("Adam", "Kowalski", 40));
        users.add(new User("Piotr", "Rosłonek", 30));
        users.add(new User("Marcin", "Witkiewicz", 35));
    }

    // zwraca liste użytkowników
    public List<User> getAll() {
        return users;
    }

    //metoda do dodawania użytkownika
    public void add(User user) {
        users.add(user);
    }
}
