package session3_exercises.problem3;

public class ShapeDemo {
    public static void main(String[] args) {
        Square square = new Square(5);
        Triangle triangle = new Triangle(4,6);
        Rectangle rectangle = new Rectangle(7, 4);
        Line line = new Line(9);
        Circle circle = new Circle(8);

        System.out.println(square.getArea() + ", " + square.getCircumference() + ", " + square.getNumberOfEdges());
    }
}
