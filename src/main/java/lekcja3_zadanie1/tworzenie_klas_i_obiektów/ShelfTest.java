package lekcja3_zadanie1.tworzenie_klas_i_obiektów;

public class ShelfTest {
    public static void main(String[] args) {
        Shelf largeShelf = new Shelf(120, 35.5, 5.5, "Czarny", 5);
        Shelf smallShelf = new Shelf(55, 30.5, 4.5, "Biały", 7);

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
