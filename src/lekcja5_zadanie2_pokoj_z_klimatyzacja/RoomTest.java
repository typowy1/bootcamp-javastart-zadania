package lekcja5_zadanie2_pokoj_z_klimatyzacja;

public class RoomTest {
    public static void main(String[] args) {
        Room room1 = new Room(5, 5, 2.5, 30, true, "Pokój dziecięcy",
                30);
        Room room2 = new Room(5, 7.5, 2.5, 25, false, "Salon",
                30);
        Room room3 = new Room(7, 9, 2.7, 19, true, "Kuchnia",
                30);
        Room room4 = new Room(5, 2.5, 2.5, 27, true, "Pokój rodziców",
                35);
        Room room5 = new Room(4, 5, 2, 21, true, "Jadalnia",
                40);

        System.out.println(room1.getInfo());
        System.out.println(room1.loweringTemperatureAndCheck());
        System.out.println();
        System.out.println(room1.getTemperatureInfoAfterLoweringTemperature());

        System.out.println();

        System.out.println(room2.getInfo());
        System.out.println(room2.loweringTemperatureAndCheck());
        System.out.println();
        System.out.println(room2.getTemperatureInfoAfterLoweringTemperature());

        System.out.println();

        System.out.println(room3.getInfo());
        System.out.println(room3.loweringTemperatureAndCheck());
        System.out.println();
        System.out.println(room3.getTemperatureInfoAfterLoweringTemperature());

        System.out.println();

        System.out.println(room4.getInfo());
        System.out.println(room4.loweringTemperatureAndCheck());
        System.out.println();
        System.out.println(room4.getTemperatureInfoAfterLoweringTemperature());

        System.out.println();

        System.out.println(room5.getInfo());
        System.out.println(room5.loweringTemperatureAndCheck());
        System.out.println();
        System.out.println(room5.getTemperatureInfoAfterLoweringTemperature());
    }
}
