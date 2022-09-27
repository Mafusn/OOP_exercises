package session2_exercises.Exercise1;

public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,5);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        System.out.println(square.getArea());
        System.out.println(square.getCircumference());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());
    }
}
