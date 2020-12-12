package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class Vehicle {

    private String brand;
    private String model;
    private double tankCapacity;
    private double averageFuelConsumptionPerHundredKm;

    public Vehicle(String brand, String model, double tankCapacity, double averageFuelConsumptionPerHundredKm) {
        this.brand = brand;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumptionPerHundredKm = averageFuelConsumptionPerHundredKm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumptionPerHundredKm() {
        return averageFuelConsumptionPerHundredKm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAverageFuelConsumptionPerHundredKm(double averageFuelConsumptionPerHundredKm) {
        this.averageFuelConsumptionPerHundredKm = averageFuelConsumptionPerHundredKm;

    }

    public double getActualFuelConsumption() {
        return averageFuelConsumptionPerHundredKm;
    }

    public double getVehicleRange() {
        return tankCapacity / averageFuelConsumptionPerHundredKm * 100;
    }

    public String getInfo() {
        return "Marka pojazdu: " + brand + ", model: " + model + ", pojemność baku: " + tankCapacity +
                ", spalanie na 100km: " + getActualFuelConsumption()
                + ", zasięg na pełnym baku: " + getVehicleRange() + "km";
    }
}
