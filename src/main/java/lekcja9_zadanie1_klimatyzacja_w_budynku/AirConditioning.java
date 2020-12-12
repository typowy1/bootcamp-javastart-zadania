package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class AirConditioning {

    private String name;
    private double targetTemperature;
    private Room room;

    public AirConditioning(String name, double targetTemperature, Room room) {
        this.name = name;
        this.targetTemperature = targetTemperature;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void lowerTemperature() {
        System.out.println("Próba włączenia klimatyzatora!");
        System.out.println("Możliwe tylko ręczne obniżenie temperatury");
    }

    public String getInfo() {
        return "Model klimatyzacji: " + name + ", temperatura docelowa pniżej której klimatyzator nie włącza się: " + targetTemperature + " \n"
                + room.getInfo() + "\n";

    }
}
