package session2_exercises.Exercise1;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getCircumference(){
        return width * 2 + height * 2;
    }

    public int getArea(){
        return width * height;
    }
}
