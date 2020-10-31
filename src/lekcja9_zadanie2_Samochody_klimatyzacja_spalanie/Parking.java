package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class Parking {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Mazda", "6", 50, 6,
                false);
        vehicles[1] = new Car("Suzuki", "Grand Vitara 2", 60, 9,
                true);
        vehicles[2] = new Truck("Mercedes", "Sprinter", 100, 10,
                true, 950);
        vehicles[3] = new Truck("Fiat", "Doblo", 60, 7,
                true, 0);

        VehicleUtils.showVehiclesInfo(vehicles);
    }
}
