package ConfectioneryPack;

import static org.junit.jupiter.api.Assertions.*;

import ConfectioneryPack.Biscuit;
import ConfectioneryPack.DataValidationException;
import ConfectioneryPack.FlourType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

class BiscuitTest {

    @Test
    public void testIndexOutOfBoundsException()  {
        //WHAT
        String [] layers = {"Usual", "Jelly", "Fantastic"};
        int layers_quan = 2;

        //WHEN
        Exception exception = assertThrows(DataValidationException.class, () -> {
            new Biscuit(312,  330, true,
                    FlourType.Wholegrain, layers_quan, layers);
        });

        String actualMessage = exception.getMessage();

        //THEN
        assertTrue(actualMessage.contains("Unequal constructor layers params!"));
    }

    @Test
    public void testOverlyCalorific() {
        //WHAT
        Biscuit testSample;
        float calories = 1200;
        String [] layers = {"Usual", "Jelly", "Fantastic"};
        int layers_quan = 3;

        //WHEN
        testSample = new Biscuit(312,  calories, true,
                FlourType.Wholegrain, layers_quan, layers);

        //THEN
        assertNotEquals(calories, testSample.getCalories(), 0.0);
    }
}