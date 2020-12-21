package ConfectioneryPack;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConfectionTest {
    @Test
    public void testNegativeCaloriesThrowsArithmeticError() {
        //WHAT
        Confection test_confection;

        //WHEN
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Sugar(1, -200, true, SugarType.Sanding, 2);
        });

        //THEN
        assertTrue(exception.getMessage().contains("Negative calories value!"));
    }
}