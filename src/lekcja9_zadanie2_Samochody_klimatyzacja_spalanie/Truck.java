package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class Truck extends Car {

    private double loadWeight;

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public Truck(String brand, String model, double tankCapacity, double averageFuelConsumptionPerHundredKm, boolean airConditioningOn, double loadWeight) {
        super(brand, model, tankCapacity, averageFuelConsumptionPerHundredKm, airConditioningOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getActualFuelConsumption() {
        if (isAirConditioningOn() && getLoadWeight() > 0) {
            double reslut = loadWeight * 0.5 / 100 + getAverageFuelConsumptionPerHundredKm() + 1.6;
            return reslut;

        } else if (!isAirConditioningOn() && getLoadWeight() > 0) {
            double reslut = loadWeight * 0.5 / 100 + getAverageFuelConsumptionPerHundredKm();
            return reslut;

        } else if (isAirConditioningOn() && getLoadWeight() == 0) {
            double reslut = getAverageFuelConsumptionPerHundredKm() + 1.6;
            return reslut;

        } else {
            return getAverageFuelConsumptionPerHundredKm();
        }
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
