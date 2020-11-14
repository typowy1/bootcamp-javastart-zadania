package lekcja6_zadanie2_punkt_w_układzie_współrzędnych;

public class PointUtils {

    String checkThePoint(Point point) {
        if (point.getX() < 0 && point.getY() < 0) {
            return "leży w I ćwiartce układu współrzędnych";

        } else if (point.getX() < 0 && point.getY() > 0) {
            return "leży w II ćwiartce układu współrzędnych";

        } else if (point.getX() > 0 && point.getY() > 0) {
            return "leży w III ćwiartce układu współrzędnych";

        } else if (point.getX() > 0 && point.getY() < 0) {
            return "leży w IV ćwiartce układu współrzędnych";

        } else {
            return "Punkt leży gdzieś poza ćwiartkami świata!";
        }
    }
}
