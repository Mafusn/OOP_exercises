package session3_exercises.problem2;

public class Green implements Color{
    private int red, green, blue;

    public Green(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void greenComponent() {
        System.out.println(this.green);
    }

    public void redComponent() {
        System.out.println(this.red);
    }

    public void blueComponent() {
        System.out.println(this.blue);
    }

    public void getGreenColor(){
        redComponent();
        greenComponent();
        blueComponent();
    }

    public static void main(String[] args) {
        Green grøn = new Green(0, 255, 0);
        grøn.getGreenColor();
    }
}
