package lekcja5_zadanie2_pokoj_z_klimatyzacja;

public class Room {

    private double length;
    private double width;
    private double height;
    private int temperature;
    private boolean airConditioning;
    private String name;
    private double airConditioningPerformance;

    public Room(double length, double width, double height, int temperature, boolean airConditioning, String name,
                double airConditioningPerformance) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.temperature = temperature;
        this.airConditioning = airConditioning;
        this.name = name;
        this.airConditioningPerformance = airConditioningPerformance;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAirConditioningPerformance() {
        return airConditioningPerformance;
    }

    public void setAirConditioningPerformance(double airConditioningPerformance) {
        this.airConditioningPerformance = airConditioningPerformance;
    }

    private boolean loweringTemperature() {
        if (isAirConditioning() && temperature > 20) {
            temperature = temperature - 1;
            return true;
        } else {
            return false;
        }
    }

    public String getInfo() {
        return name + "\n" +
                "length: " + length + "m\n" +
                "width: " + width + "m\n" +
                "height: " + height + "m\n" +
                "temperature: " + temperature + "C\n" +
                "is airConditioning installed ?: " + airConditioning + "\n" +
                "Air Conditioning performance: " + airConditioningPerformance + "m(3);" + "\n" +
                "Room volume: " + getRoomVolume() + "m(2)";
    }

    public String getTemperatureInfoAfterLoweringTemperature() {
        return getName() + "\n" +
                "temperature: " + temperature + "C";
    }

    public String loweringTemperatureAndCheck() {
        if (loweringTemperature()) {
            return "Pomieszczenie: " + getName() + ": obniżam teperature, temperatura po obniżeniu wynosi: "
                    + temperature + "C " + ", wydajnosć klimatyzacji dla tego pomieszczenia to: "
                    + getAirConditioningPerformancePerRoom();
        } else {
            return "Pomieszczenie: " + name + ": nie można obniżyć temperatury!, sprawdź czy klimatyzacja jest zamontowana "
                    + "lub sprawdź temperatyrę graniczną.";
        }
    }

    public double getRoomVolume() {
        return length * width * height;
    }

    public String getAirConditioningPerformancePerRoom() {
        if (getRoomVolume() < airConditioningPerformance) {
            return "100%";
        } else if (getRoomVolume() == airConditioningPerformance) {
            return "80%";
        } else {
            return "50%";
        }
    }
}
