package lekcja11_zadanie3_komputer;

public abstract class Indicators extends Component {

    private int frequency;
    private double temperature;

    public Indicators(String name, String manufacturer, String serialNumber, int frequency, double temperature) {
        super(name, manufacturer, serialNumber);
        this.frequency = frequency;
        this.temperature = temperature;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int timing) {
        this.frequency = timing;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", taktowanie: " + frequency + "MHz, temperatura: " + temperature + "C";
    }

    public abstract void checkTemperature(double temperature);

    public abstract void checkFrequency(int frequency);
}
