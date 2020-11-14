package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class Building {
    public static void main(String[] args) {

        Room[] rooms = new Room[3];
        rooms[0] = new Room("Sypialnia", 15, 25);
        rooms[1] = new Room("Kuchnia", 10, 22);
        rooms[2] = new Room("Salon", 14, 19);

        AirConditioning[] airConditioning = new AirConditioning[3];
        airConditioning[0] = new BasicAirConditioner("Basic air conditioner", 20, rooms[0]);
        airConditioning[1] = new ProAirConditioner("Pro air conditioner", 20, rooms[1]);
        airConditioning[2] = new ProAirConditioner("Pro air conditioner", 20, rooms[2]);

        BuldingUtils.showTemperatureRoomsInfo(rooms);
        System.out.println();

        airConditioning[0].lowerTemperature();
        System.out.println(airConditioning[0].getInfo());

        airConditioning[1].lowerTemperature();
        System.out.println(airConditioning[1].getInfo());

        airConditioning[2].lowerTemperature();
        System.out.println(airConditioning[2].getInfo());

    }
}
