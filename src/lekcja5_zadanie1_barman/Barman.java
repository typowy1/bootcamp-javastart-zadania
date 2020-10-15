package lekcja5_zadanie1_barman;

public class Barman {

    public String order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isIncludesAlcohol()) {
            return "Przykro mi alkoholu nieletnim nie sprzedajemy!";
        } else if (person.getAge() >= 18) {
            return person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty "
                    + drink.getPrice() + "zł";
        } else if (person.getAge() < 18 && !drink.isIncludesAlcohol()) {
            return person.getFirstName() + ", Twój drink bezalkoholowy jest gotowy do odbioru. Kwota do zapłaty "
                    + drink.getPrice() + "zł";
        }
        return null;
    }

    public void sellingADrink(String answer) {
        if (answer != null) {
            System.out.println(answer);
        } else {
            System.out.println("Przykro mi, jesteś za bardzo pijany, nie sprzedamy ci już alkoholu!");
        }
    }
}
