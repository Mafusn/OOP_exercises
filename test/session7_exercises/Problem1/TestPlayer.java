package session7_exercises.Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlayer {
    Player player = null;
    @BeforeEach
    public void beforeEach() {
        player = new Player("Lars", 195, 85);
    }

    @Test
    public void getName() {
        assertEquals("Lars", player.getName());
    }

    @Test
    public void getHeight() {
        assertEquals(195, player.getHeight());
    }

    @Test
    public void getWeight(){
        assertEquals(85, player.getWeight());
    }

    @Test
    public void BMI() {
        assertEquals("Normal", player.getBMI());
    }
}
