package lekcja4_zadanie2_pola_figur;

public class CalculatorTest {
    public static void main(String[] args) {

        Square square1 = new Square(7.6);
        double squareArea = square1.calculateArea();
        System.out.println("Square area: " + squareArea + "cm");

        Rectangle rectangle1 = new Rectangle(4, 8.6);
        double rectanglePerimeter = rectangle1.calculatePerimeter();
        System.out.println("Rectangle perimeter: " + rectanglePerimeter + "cm");

        Circle circle1 = new Circle(6);
        double circleArea = circle1.calculateArea();
        System.out.println("Circle area: " + circleArea + "cm");

        Triangle triangle1 = new Triangle(5, 7.5, 9);
        double trianglePerimeter = triangle1.calculatePerimeter();
        System.out.println("Triangle perimeter: " + trianglePerimeter + "cm");
    }
}
