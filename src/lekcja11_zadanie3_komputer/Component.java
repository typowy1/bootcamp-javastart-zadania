package lekcja11_zadanie3_komputer;

public abstract class Component {
    private String name;
    private String manufacturer;
    private String serialNumber;

    public Component(String name, String manufacturer, String serialNumber) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "nazwa: " + name + ", producent: " + manufacturer + ", numer seryjny: " + serialNumber;
    }
}
