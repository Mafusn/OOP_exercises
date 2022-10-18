package session7_exercises.Problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVector2D {
    Vector2D vector1 = null;
    Vector2D vector2 = null;

    @BeforeEach
    public void beforeEach() {
        vector1 = new Vector2D(2, 4);
        vector2 = new Vector2D(1, 5);
    }

    @Test
    public void addition1() {
        Vector2D vectorAddition = vector1.addition(vector2);

        assertEquals(3, vectorAddition.getX());
        assertEquals(9, vectorAddition.getY());
    }

    @Test
    public void subtraction1() {
        Vector2D vectorSubtraction = vector1.subtraction(vector2);

        assertEquals(1, vectorSubtraction.getX());
        assertEquals(-1, vectorSubtraction.getY());
    }

    @Test
    public void scalarprodukt1() {
        assertEquals(22, vector1.scalarprodukt(vector2));
    }

    @Test
    public void crossProduct1() {
        assertEquals(6, vector1.crossProduct(vector2));
    }
}
