package ConfectioneryPack;

import org.junit.Test;

import static org.junit.Assert.*;

public class SugarTest {
    @Test
    public void testDifferentSugarUnequality() {
        //WHAT
        Confection sample1 = new Sugar(1, 1, true, SugarType.Sanding, 10);
        Confection sample2 = new Sugar(1, 1, true, SugarType.Sanding, 10);
        Confection sample3 = sample1;
        if(!sample1.equals(sample2)) {
            System.out.println("Sugar classes aren't equal coz pointers refers to different references.");
        }


        //WHEN


        //THEN
        assertTrue(sample1.equals(sample3));
        assertFalse(sample1.equals(sample2));
    }
}