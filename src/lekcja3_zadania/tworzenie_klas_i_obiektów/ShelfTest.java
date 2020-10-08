package lekcja3_zadania.tworzenie_klas_i_obiektów;

public class ShelfTest {
    public static void main(String[] args) {
        Shelf largeShelf = new Shelf();
        largeShelf.length = 120;
        largeShelf.height = 5.5;
        largeShelf.width = 35.5;
        largeShelf.colour = "Czarny";
        largeShelf.age = 5;

        Shelf smallShelf = new Shelf();
        smallShelf.length = 55;
        smallShelf.height = 4.5;
        smallShelf.width = 30.5;
        smallShelf.colour = "Biały";
        smallShelf.age = 7;

        System.out.println("Informacje o dużej półce:");
        System.out.println("Długość: " + largeShelf.length + "cm" + ", wysokość: " + largeShelf.height + "cm"
                + ", szerokość: " + largeShelf.width + "cm" + ", kolor: " + largeShelf.colour
                + ", wiek: " + largeShelf.age + " lat");

        System.out.println("Informacje o małej półce:");
        System.out.println("Długość: " + smallShelf.length + "cm" + ", wysokość: " + smallShelf.height + "cm"
                + ", szerokość: " + smallShelf.width + "cm" + ", kolor: " + smallShelf.colour
                + ", wiek: " + smallShelf.age + " lat");
    }
}
