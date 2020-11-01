package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class Truck extends Car {

    private static double AIR_CONDITION_CONSUMPTION = 1.6;
    private static double ADDITIONAL_LOAD_CONSUMPTION = 0.5;
    private double loadWeight;

    public Truck(String brand, String model, double tankCapacity, double averageFuelConsumptionPerHundredKm, boolean airConditioningOn, double loadWeight) {
        super(brand, model, tankCapacity, averageFuelConsumptionPerHundredKm, airConditioningOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double getActualFuelConsumption() {
        double totalConsumption = getAverageFuelConsumptionPerHundredKm();
        if (isAirConditioningOn()) {
            totalConsumption += AIR_CONDITION_CONSUMPTION;
        }
        double loadConsumption = loadWeight / 100 * ADDITIONAL_LOAD_CONSUMPTION;
        totalConsumption += loadConsumption;
        return totalConsumption;
    }

    @Override
    public double getVehicleRange() {
        return getTankCapacity() / getActualFuelConsumption() * 100;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", waga ładunku: " + loadWeight;
    }
}
