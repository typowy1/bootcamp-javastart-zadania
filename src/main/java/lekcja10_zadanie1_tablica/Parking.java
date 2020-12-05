package lekcja10_zadanie1_tablica;

public class Parking {
    public static void main(String[] args) {
        Car[] cars = CarUtils.createTable();
        CarUtils.enterCar(cars);
        CarUtils.showCarsInfo(cars);
    }
}
