package ConfectioneryPack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test(expected = DataValidationException.class)
    public void testIndexOutOfBoundsException() throws DataValidationException {
        //WHAT
        String [] layers = {"Usual", "Jelly", "Fantastic"};
        int layers_quan = 2;
        Biscuit testSample;

        //WHEN
        testSample = new Biscuit(312,  330, true,
                FlourType.Wholegrain, layers_quan, layers);

        //THEN
        // exception is thrown
    }

    @Test
    public void testOverlyCalorific() throws DataValidationException {
        //WHAT
        Biscuit testSample;
        float calories = 1200;
        String [] layers = {"Usual", "Jelly", "Fantastic"};
        int layers_quan = 2;

        //WHEN
        testSample = new Biscuit(312,  calories, true,
                FlourType.Wholegrain, layers_quan, layers);

        //THEN
        assertFalse(testSample.getCalories() == calories);
    }
} 