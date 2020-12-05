package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class BuldingUtils {

    public static void showTemperatureRoomsInfo(Room[] rooms) {

        for (Room room : rooms) {
            if (room != null) {
                System.out.println(room.getName() + ", temperatura: " + room.getTemperature());
            }
        }
    }
}
