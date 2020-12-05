package lekcja10_zadanie2_kalkulator;

public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D(0, 5, 0, 5);
        shapes[1] = new Circle(8);
        shapes[2] = new Rectangle(5, 10);
        shapes[3] = new Ball(5);
        shapes[4] = new Cube(10);

        Line2D line2D = (Line2D) shapes[0];
        Circle circle = (Circle) shapes[1];
        Rectangle rectangle = (Rectangle) shapes[2];
        Ball ball = (Ball) shapes[3];
        Cube cube = (Cube) shapes[4];

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println(line2D.toString() + " ma długość " + shapeCalculator.lineLength((Line2D) shapes[0]));
        System.out.println(circle.toString() + " ma pole " + shapeCalculator.circleArea((Circle) shapes[1]));
        System.out.println(rectangle.toString() + " ma pole " + shapeCalculator.rectangleArea((Rectangle) shapes[2]));
        System.out.println(ball.toString() + " ma objętość " + shapeCalculator.ballVolume((Ball) shapes[3]));
        System.out.println(cube.toString() + " ma objętość " + shapeCalculator.cubeVolume((Cube) shapes[4]));
    }
}
