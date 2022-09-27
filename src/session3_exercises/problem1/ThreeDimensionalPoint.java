package session3_exercises.problem1;

public class ThreeDimensionalPoint extends TwoDimensionalPoint{
    private int z;
    private String color;

    public ThreeDimensionalPoint(int x, int y, int z, String color) {
        super(x, y);
        this.z = z;
        this.color = color;
    }

    public void getThreeDimensionalPoint(){
        System.out.println(this.getX() + ", " + this.getY() + ", " + this.z + "\nColor: " + this.color);
    }

    public static void main(String[] args) {
        ThreeDimensionalPoint tester = new ThreeDimensionalPoint(2, 4, 5, "red");

        tester.getThreeDimensionalPoint();
    }
}
