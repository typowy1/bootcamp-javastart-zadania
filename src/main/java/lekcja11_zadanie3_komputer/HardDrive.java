package lekcja11_zadanie3_komputer;

public class HardDrive extends Component {

    private int capacity;

    public HardDrive(String name, String manufacturer, String serialNumber, int capacity) {
        super(name, manufacturer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", pojemność: " + capacity + "GB";
    }
}
