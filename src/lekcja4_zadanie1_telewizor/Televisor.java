package lekcja4_zadanie1_telewizor;

public class Televisor {

    boolean tvStatus;

    public Televisor(boolean tvStatus) {
        this.tvStatus = tvStatus;
    }

    void turnOn() {
        tvStatus = true;
    }

    void turnOff() {
        tvStatus = false;
    }

    public boolean getTvStatus() {
        return tvStatus;
    }

    void showStatus() {
        System.out.println("TV is turned On? " + getTvStatus());
    }
}
