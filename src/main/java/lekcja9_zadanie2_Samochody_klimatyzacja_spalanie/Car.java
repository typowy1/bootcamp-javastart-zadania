package lekcja9_zadanie2_Samochody_klimatyzacja_spalanie;

public class Car extends Vehicle {

    private static double AIR_CONDITION_CONSUMPTION = 0.8;
    private boolean airConditioningOn;

    public Car(String brand, String model, double tankCapacity, double averageFuelConsumptionPerHundredKm, boolean airConditioningOn) {
        super(brand, model, tankCapacity, averageFuelConsumptionPerHundredKm);
        this.airConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
    }

    @Override
    public double getActualFuelConsumption() {
        if (airConditioningOn) {
            return getAverageFuelConsumptionPerHundredKm() + AIR_CONDITION_CONSUMPTION;
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
        return super.getInfo() + ", czy klimatyzacja jest włączona: " + airConditioningOn;
    }
}
