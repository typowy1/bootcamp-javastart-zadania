package lekcja4_zadanie2_pola_figur;

public class ShapeCalculator {

    double squareArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    double rectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
    }
}
