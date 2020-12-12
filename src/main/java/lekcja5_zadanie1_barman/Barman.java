package lekcja5_zadanie1_barman;

public class Barman {

    public String order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isIncludesAlcohol()) {
            return "Przykro mi alkoholu nieletnim nie sprzedajemy!";
        } else if (person.getAge() >= 18 && drink.isIncludesAlcohol()) {
            return person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty "
                    + drink.getPrice() + "zł";
        } else if (person.getAge() < 18 && !drink.isIncludesAlcohol()) {
            return person.getFirstName() + ", Twój drink bezalkoholowy jest gotowy do odbioru. Kwota do zapłaty "
                    + drink.getPrice() + "zł";
        } else {
            return person.getFirstName() + ", Twój drink bezalkoholowy jest gotowy do odbioru. Kwota do zapłaty "
                    + drink.getPrice() + "zł";
        }
    }

    public void sellingADrink(String answer) {
        System.out.println(answer);
    }
}
