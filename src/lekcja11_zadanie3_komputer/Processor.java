package lekcja11_zadanie3_komputer;

public class Processor extends Indicators implements Overclockable {

    private static final int MAX_TEMPERATURE = 120;
    private static final int MAX_FREQUENCY = 4000;
    private int cores;

    public Processor(String name, String manufacturer, String serialNumber, int frequency, double temperature, int cores) {
        super(name, manufacturer, serialNumber, frequency, temperature);
        checkTemperature(temperature);
        checkFrequency(frequency);
        this.cores = cores;
    }

    public static int getMaxTemperature() {
        return MAX_TEMPERATURE;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return super.toString() + ", ilość rdzeni: " + cores;
    }

    @Override
    public void checkTemperature(double temperature) {
        if (temperature > MAX_TEMPERATURE) {
            throw new IllegalArgumentException("Temperatura procesora za duża: " + temperature + "C, max to "
                    + MAX_TEMPERATURE + "C");
        }
    }

    @Override
    public void checkFrequency(int frequency) {
        if (frequency > MAX_FREQUENCY) {
            throw new IllegalArgumentException("Prędkość procesora za duża: " + frequency + "MHz, max to "
                    + MAX_FREQUENCY + "MHz");
        }
    }

    @Override
    public void overclock() {
        setTemperature(getTemperature() + 10);
        checkTemperature(getTemperature());
        setFrequency(getFrequency() + 100);
        checkFrequency(getFrequency());
    }
}
