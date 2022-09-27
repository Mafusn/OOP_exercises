package session2_exercises.Exercise1;

public class Circle {
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public double getCircumference(){
        return (double) radius * 2 * Math.PI;
    }

    public double getArea(){
        return (double) radius * (double) radius * Math.PI;
    }
}
