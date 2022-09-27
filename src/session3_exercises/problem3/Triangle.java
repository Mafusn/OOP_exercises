package session3_exercises.problem3;

public class Triangle implements Shape{
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0.5 * height * width;
    }

    @Override
    public double getCircumference() {
        return width * 3;
    }

    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}
