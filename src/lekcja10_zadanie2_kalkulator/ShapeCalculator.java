package lekcja10_zadanie2_kalkulator;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double lineLength(Line2D line) {

        return super.lineLength(line);
    }

    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {

        return rectangle.getA() * rectangle.getB();
    }

    @Override
    public double ballVolume(Ball ball) {

        return 4.0 / 3.0 * Math.PI * (Math.pow(ball.getR(), 3));
    }

    @Override
    public double cubeVolume(Cube cube) {

        return Math.pow(cube.getA(), 3);
    }
}
