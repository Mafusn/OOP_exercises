package session7_exercises.Problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassword {
    @Test
    public void isStrong1() {
        Password password = new Password("jgk23jgK!");
        assertEquals("strong", password.isStrong());
    }
}
