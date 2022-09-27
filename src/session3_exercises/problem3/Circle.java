package session3_exercises.problem3;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public int getNumberOfEdges() {
        return 0;
    }
}
