package lekcja11_zadanie3_komputer;

public class Memory extends Indicators implements Overclockable {

    private static final int MAX_TEMPERATURE = 120;
    private static final int MAX_FREQUENCY = 2500;
    private static final int ADDED_TEMPERATURE = 15;
    private static final int ADDED_FREQUENCY = 100;
    private int amount;

    public Memory(String name, String manufacturer, String serialNumber, int frequency, double temperature, int amount) {
        super(name, manufacturer, serialNumber, frequency, temperature);
        checkTemperature(temperature);
        checkFrequency(frequency);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", ilość pamięci: " + amount + "MB";
    }

    @Override
    public void checkTemperature(double temperature) {
        if (temperature > MAX_TEMPERATURE) {
            throw new IllegalArgumentException("Temperatura pamięci za duża: " + temperature + "C, max to "
                    + MAX_TEMPERATURE + "C");
        }
    }

    @Override
    public void checkFrequency(int frequency) {
        if (frequency > MAX_FREQUENCY) {
            throw new IllegalArgumentException("Prędkość pamięci za duża: " + frequency + "MHz, max to "
                    + MAX_FREQUENCY + "MHz");
        }
    }

    @Override
    public void overclock() {
        checkTemperature(getTemperature() + ADDED_TEMPERATURE);
        setTemperature(getTemperature() + ADDED_TEMPERATURE);
        setFrequency(getFrequency() + ADDED_FREQUENCY);
        checkFrequency(getFrequency());
    }
}
