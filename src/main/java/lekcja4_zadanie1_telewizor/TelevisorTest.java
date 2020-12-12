package lekcja4_zadanie1_telewizor;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor(false);
        televisor1.showStatus();
        televisor1.turnOn();
        televisor1.showStatus();
        televisor1.turnOff();
        televisor1.showStatus();
    }
}
