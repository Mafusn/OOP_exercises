package session3_exercises.problem2;

public class Blue implements Color {
    private int red, green, blue;

    public Blue(int red, int green, int blue) {
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

    public void getBlueColor(){
        redComponent();
        greenComponent();
        blueComponent();
    }

    public static void main(String[] args) {
        Blue blue = new Blue(0, 0, 255);
        blue.getBlueColor();
    }
}
