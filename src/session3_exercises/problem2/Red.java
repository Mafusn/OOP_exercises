package session3_exercises.problem2;

public class Red implements Color{
    int red;
    int blue;
    int green;

    public Red(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
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

    public void getRedColor(){
        redComponent();
        greenComponent();
        blueComponent();
    }

    public static void main(String[] args) {
        Red rød = new Red(255,0,0);
        rød.getRedColor();
    }
}
