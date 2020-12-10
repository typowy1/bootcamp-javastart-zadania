package lekcja6_zadanie2_punkt_w_układzie_współrzędnych;

import java.util.Scanner;

public class Space {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne punktu x:");
        int pointX = scanner.nextInt();

        System.out.println("Podaj współrzędne punktu y:");
        int pointY = scanner.nextInt();

        Point point = new Point(pointX, pointY);
        PointUtils pointUtils = new PointUtils();
        String pointCoordinates = pointUtils.checkThePoint(point);
        System.out.println("Punkt: " + point.getX() + ", " + point.getY() + " " + pointCoordinates);
    }
}
