package lekcja4_zadanie2_pola_figur;

public class CalculatorTest {
    public static void main(String[] args) {

        Square square1 = new Square(7.6);
        Rectangle rectangle1 = new Rectangle(4, 8.6);
        Circle circle1 = new Circle(6);
        Triangle triangle1 = new Triangle(5, 7.5, 9);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareArea = shapeCalculator.squareArea(square1);
        double rectanglePerimeter = shapeCalculator.rectPerimeter(rectangle1);
        double circleArea = shapeCalculator.circleArea(circle1);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle1);

        System.out.println("Square area: " + squareArea + "cm");
        System.out.println("Rectangle perimeter: " + rectanglePerimeter + "cm");
        System.out.println("Circle area: " + circleArea + "cm");
        System.out.println("Triangle perimeter: " + trianglePerimeter + "cm");
    }
}
