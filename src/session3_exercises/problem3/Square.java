package session3_exercises.problem3;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getCircumference() {
        return width * 4;
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }
}
