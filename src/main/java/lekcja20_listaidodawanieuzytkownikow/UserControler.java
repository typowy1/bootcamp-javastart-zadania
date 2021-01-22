package lekcja20_listaidodawanieuzytkownikow;

import java.util.List;

//@Controller - to można dodać jak używamy springa
public class UserControler {

    // tworze kontroler dla userów i wstrzykuje reposytorium userow do niego

    private UserRepository userRepository; // pole repozytorium

    // tworzymy konstruktor  i spring podczas tworzenia kontrolera będzie tworzyć user reposytory

    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    4. W kontrolerze zdefiniuj metody, które obsłużą poniższe adresy:
//
//    Po wejściu na adres /users powinna zostać wyświetlona lista użytkowników
//    Pod adresem /add?imie=Daniel&nazwisko=Abacki&wiek=15 powinno być możliwe dodawanie użytkownika. Upewnij się, że nie dodasz użytkownika z pustym imieniem. Po dodaniu użytkownika powinna wyświetlić się strona success.html, a w przypadku podania pustego imienia strona err.html – oba pliki umieść w folderze static.

    //    Po wejściu na adres /users powinna zostać wyświetlona lista użytkowników
    //@ResponseBody to można dodać jak używamy springa // zostanie wyświetlone od razu w wyniku zapytania
    //@GetMapping("/users") to można dodać jak używamy springa
    // tworzymy strone users, Po wejściu na adres /users powinna zostać wyświetlona lista użytkowników
    public String usersList() {
        List<User> allUsers = userRepository.getAll();

        String result = ""; // wu trafią urzytkownicy

        for (User user : allUsers) {
            result += user.toString() + "<br/>"; //to wyświetli usera z listy i przejdzie do kolejnej listy
        }
        return result;
    }

    //    Pod adresem /add?imie=Daniel&nazwisko=Abacki&wiek=15 powinno być możliwe dodawanie użytkownika. Upewnij się,
    //    że nie dodasz użytkownika z pustym imieniem. Po dodaniu użytkownika powinna wyświetlić się strona success.html,
    //    a w przypadku podania pustego imienia strona err.html – oba pliki umieść w folderze static.

    //  /add?imie=Daniel&nazwisko=Abacki&wiek=15
    //@GetMapping("/add") //tworze/mapuje strone add, tu nie użyliśmy response body ponieważ zwracamy strone utworzoną w folderze static

    // @RequestMapping("/add")to można dodać jak używamy springa
    // zmieniliśmy żeby zadziałało z dowolną metodą, teraz działa z metodą get i metodą post z index.html
    public String add(/*HttpServletRequest request - to można dodać jak używamy springa*/) {
        //pobieramy informacje z strony

//        String imie = request.getParameter("imie"); - to można dodać jak używamy springa
//        String nazwisko = request.getParameter("nazwisko"); - to można dodać jak używamy springa
//        String wiek = request.getParameter("wiek"); - to można dodać jak używamy springa

        // - to można dodać jak używamy springa
        //  int age = Integer.parseInt(wiek); // zamieniamy stringa na int

        //Upewnij się, że nie dodasz użytkownika z pustym imieniem
        // if (!StringUtils.hasLength(imie)) { // sprawdzamy czy imie nie jest puste i czy nie jest pustym ciągiem znaków
        return "redirect:/err.html"; //redirect:/err.html - przekierowanie na strone// przy pustym imieniu zwracamy/wyświetlamy stronę err.html z informacją błąd, strone tworzymy w folderze static
        //  } else { // jeśli pole nie jest puste to chcemy dodać nowego użytkownika

        //    User user = new User(imie, nazwisko, age);
        // dodajemu użytkownika do repozytorium
        //   userRepository.add(user);
        //    return "redirect:/success.html"; //przy poprawnym dodaniu użytkownika zwracamy strone sukces z utworzoną w folderze static
    }

//5. Dodaj możliwość dodawania użytkowników do repozytorium za pomocą formularza i metody POST. Formularz powinien znajdować
//się na stronie głównej, czyli w pliku index.html. Tym razem przekieruj użytkownika na stronię success.html lub err.html
//zwracając tekst: "redirect:/success.html" lub "redirect:/err.html".
//zrobiliśmy to wyżej dodając @RequestMapping("/add") i redirect:/success.html itd

}
