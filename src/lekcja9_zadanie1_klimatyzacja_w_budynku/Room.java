package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class Room {

    private String name;
    private double volume;
    private double temperature;

    public Room(String name, double volume, double temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getInfo() {
        return "Pomieszczenie: " + name + ", kubatura pomieszczenia: " + volume + "m3" + ", temperatura pomieszczenia: " + temperature + "C";
    }
}
