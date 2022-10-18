package session7_exercises.Problem2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;

public class Vector2D {
    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vector2D addition(Vector2D vector1) {
        Vector2D vector3 = new Vector2D(0, 0);

        int x = vector1.getX() + this.getX();
        int y = vector1.getY() + this.getY();

        vector3.setX(x);
        vector3.setY(y);
        return vector3;
    }

    public Vector2D subtraction(Vector2D vector1) {
        Vector2D vector3 = new Vector2D(0, 0);

        int x = this.getX() - vector1.getX();
        int y = this.getY() - vector1.getY();

        vector3.setX(x);
        vector3.setY(y);
        return vector3;
    }

    public int scalarprodukt(Vector2D vector1) {
        return this.x * vector1.getX() + this.y * vector1.getY();
    }

    public int crossProduct(Vector2D vector1) {
        return this.x * vector1.getY() - this.y * vector1.getX();
    }
}
