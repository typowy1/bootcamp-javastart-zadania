package lekcja10_zadanie1_tablica;

import java.util.Scanner;

public class CarUtils {

    static Scanner scanner = new Scanner(System.in);

    private static int enterQuantity() {
        int quantity = 0;
        do {
            System.out.println("Podaj ilość samochodów do wprowadzenie, maksymalna ilość to 3!");
            quantity = scanner.nextInt();
            scanner.nextLine();
        } while (quantity > 3);
        return quantity;
    }

    public static Car[] createTable() {
        int carQuantity = enterQuantity();
        Car[] cars = new Car[carQuantity];
        return cars;
    }

    private static Car createCar() {
        System.out.println("Podaj nazwę samochodu:");
        String name = scanner.nextLine();

        System.out.println("Podaj wiek samochodu:");
        int age = scanner.nextInt();
        scanner.nextLine();
        Car car = new Car(name, age);
        return car;
    }

    public static void enterCar(Car[] cars) {
        int i = 0;

        while (i < cars.length) {
            Car car = CarUtils.createCar();
            if (!isUnique(car, cars)) {
                cars[i] = car;
                i++;
            } else {
                System.out.println("Duplikat");
            }
        }
    }

    private static boolean isUnique(Car car, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (car.equals(cars[i])) {
                return true;
            }
        }
        return false;
    }

    public static void showCarsInfo(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
