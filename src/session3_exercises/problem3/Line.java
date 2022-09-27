package session3_exercises.problem3;

public class Line implements Shape{
    private double width;

    public Line(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return width;
    }

    @Override
    public int getNumberOfEdges() {
        return 1;
    }
}
