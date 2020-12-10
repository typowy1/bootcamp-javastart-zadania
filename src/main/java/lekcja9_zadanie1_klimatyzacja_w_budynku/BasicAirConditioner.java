package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class BasicAirConditioner extends AirConditioning {

    public BasicAirConditioner(String name, double targetTemperature, Room room) {
        super(name, targetTemperature, room);
    }

    @Override
    public void lowerTemperature() {
        System.out.println("Próba włączenia klimatyzatora!");
        if (getRoom().getTemperature() > getTargetTemperature()) {
            double result = 1 / getRoom().getVolume();
            getRoom().setTemperature(getRoom().getTemperature() - result);
        } else {
            System.out.println("Klimatyzator nie włącza się poniżej temperatury: " + getTargetTemperature() + "C");
        }
    }
}
