package lekcja5_zadanie1_barman;

public class Bar {

    public static void main(String[] args) {
        Drink drink1 = new Drink("Tequila Sunrise", 50, true);
        Drink drink2 = new Drink("Hot Blooded", 30, true);
        Drink drink3 = new Drink("Mojito", 25, false);

        Person person1 = new Person("Piotr", "Kowalski", 20);
        Person person2 = new Person("Adam", "Kowalkiewicz", 17);
        Person person3 = new Person("Rafał", "Szymkowski", 18);
        Person person4 = new Person("Piotr", "Urbanowski", 35);

        Barman barman = new Barman();
        String answer1 = barman.order(person1, drink1);
        String answer2 = barman.order(person2, drink2);
        String answer3 = barman.order(person2, drink3);
        String answer4 = barman.order(person3, drink3);
        String answer5 = barman.order(person4, drink3);

        barman.sellingADrink(answer1);
        barman.sellingADrink(answer2);
        barman.sellingADrink(answer3);
        barman.sellingADrink(answer4);
        barman.sellingADrink(answer5);
    }
}
