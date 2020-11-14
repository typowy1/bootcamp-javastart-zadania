package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class VehicleUtils {

    public static void showVehiclesInfo(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getInfo());
            System.out.println();
        }
    }
}
