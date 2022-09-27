package session2_exercises.Exercise1;

public class Square {
    private int width;

    Square(int width){
        this.width = width;
    }

    public int getCircumference(){
        return width * 4;
    }

    public int getArea(){
        return width * width;
    }
}
