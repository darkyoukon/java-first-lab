package ConfectioneryPack;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OrderTest {
    @Test
    public void testCheckOrderNotEmptyWhileAddingIngredients() {
        //WHAT
        Order order = null;
        Sugar cafe_sugar = new Sugar(1115, 100, true, SugarType.Sanding, 2);
        Cocoa cocoa = new Cocoa(500, 120, cafe_sugar);

        Marshmallow zephirky = new Marshmallow(1815, 86, true,
                cafe_sugar.getSugarType(), 25, "зефирки к какао");
        Marshmallow marsh_starbucks = new Marshmallow(712, 65, true,
                SugarType.Pearl, 5, "маршмеллоу в какао");
        cocoa.addZephyr(zephirky);
        cocoa.addZephyr(marsh_starbucks);

        String [] layers = {"Usual", "Jelly", "Fantastic"};
        String [] layers_second = {"Jelly", "Fantastic"};

        //WHEN
        try {
            Biscuit cafe_biscuit = new Biscuit(313,  150, true,
                    FlourType.Rye, 3, layers);
            Biscuit cafe_biscuit_second = new Biscuit(121,  120, true,
                    FlourType.Rye, 2, layers_second);

            order = new Order(cocoa, cafe_biscuit);
            order.addBiscuit(cafe_biscuit_second);
        } catch (DataValidationException err) {
            err.printStackTrace();
            System.out.println("Difference between written manually layers quan and array length is " + err.getInsufficientQuantity());
            System.exit(1);
        }

        //THEN
        assertTrue(order.getCocoas().size() == 1);
        assertTrue(order.getBiscuits().size() == 2);
    }

    @Test
    public void testCheckIfSugarDoesntExistsInCocoaOrder() {
        //WHAT
        Sugar cafe_sugar = new Sugar(1115, 100, true, SugarType.Sanding, 2);
        Cocoa cocoa = new Cocoa(500, 120, cafe_sugar);
        Order order = new Order(cocoa);

        //WHEN


        //THEN
        assertFalse(order.checkSugarSufficiency(SugarType.Sanding));
    }
}
