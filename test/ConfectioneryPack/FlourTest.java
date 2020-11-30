package ConfectioneryPack;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlourTest {

    @Test
    public void testFlourTypeEqualitySameTypes()  {
        //WHAT
        Flour test_flour1 = new Flour(0, 200, true, FlourType.Rye);
        Flour test_flour2 = new Flour(1, 210, true, FlourType.Rye);

        //WHEN


        //THEN
        assertTrue(test_flour1.equals(test_flour2));
    }

    @Test
    public void testFlourTypeEqualitySameNums()  {
        //WHAT
        Flour test_flour1 = new Flour(0, 200, true, FlourType.Rye);
        Flour test_flour2 = new Flour(0, 210, true, FlourType.Wholegrain);

        //WHEN


        //THEN
        assertTrue(test_flour1.equals(test_flour2));
    }

    @Test
    public void testFlourType() {
        //WHAT
        Flour test_flour1 = new Flour(0, 200, true, FlourType.Rye);

        //WHEN
        test_flour1.setFlourType(FlourType.Rice);

        //THEN
        assertTrue(test_flour1.getFlourType() == FlourType.Rice);
    }
}