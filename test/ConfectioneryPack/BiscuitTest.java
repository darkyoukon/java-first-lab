package ConfectioneryPack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test(expected = DataValidationException.class)
    public void testIndexOutOfBoundsException() {
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
    public void testOverlyCalorific() throws DataValidationException {
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