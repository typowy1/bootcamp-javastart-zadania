package lekcja9_zadanie1_klimatyzacja_w_budynku;

public class ProAirConditioner extends AirConditioning {

    public ProAirConditioner(String name, double targetTemperature, Room room) {
        super(name, targetTemperature, room);
    }

    @Override
    public void lowerTemperature() {
        System.out.println("Próba włączenia klimatyzatora!");
        if (getRoom().getTemperature() > getTargetTemperature()) {
            double result = getRoom().getTemperature() - 1;
            getRoom().setTemperature(result);
        } else {
            System.out.println("Klimatyzator nie włącza się poniżej temperatury docelowej: " + getTargetTemperature() + "C");
        }
    }
}
