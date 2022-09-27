package session3_exercises.problem1;

public class TwoDimensionalPoint {
    private int y, x;

    TwoDimensionalPoint(){
        this.x = 0;
        this.y = 0;
    }
    TwoDimensionalPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
