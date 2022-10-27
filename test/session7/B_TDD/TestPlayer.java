package session7.B_TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *  Badminton Player:
 *
 *  - Write a class to represent a badminton player.
 *
 *  - A player has a name and a number of won and lost matches.
 *
 *  Exercise (using TDD):
 *  - Add a method "void wonMatch()" to the player class to signal s/he has won a match (and measure test coverage).
 */
public class TestPlayer {

    Player player = null;

    @BeforeEach
    public void beforeEach() {
        player = new Player("Andres");
    }

    @Test
    public void testPlayerName() {
        assertNotNull(player);
        assertEquals(player.getName(), "Andres");
    }

    @Test
    public void testWins() {
        assertEquals(0, player.getWins());
    }

    @Test
    public void testLoses() {
        assertEquals(0, player.getLoses());
    }

    @Test
    public void testSetWins() {
        player.setWins(2);
        assertEquals(2, player.getWins());
    }
}
