package ConfectioneryPack;

import org.junit.Test;

import static org.junit.Assert.*;

public class CocoaTest {
    @Test
    public void testCheckCalories() {
        //WHAT
        int milk_quan = 500;
        Sugar cafe_sugar = new Sugar(1115, 100, true, SugarType.Sanding, 2);
        Cocoa test_hot_usual_cocoa = new Cocoa(milk_quan, 200, cafe_sugar);
        Marshmallow zephirky = new Marshmallow(1815, 86, true,
                cafe_sugar.getSugarType(), 25, "зефирки к какао");
        Marshmallow marsh_starbucks = new Marshmallow(712, 65, true,
                SugarType.Pearl, 5, "маршмеллоу в какао");
        float cocoa_calories = test_hot_usual_cocoa.getCalories();

        //WHEN
        test_hot_usual_cocoa.addZephyr(zephirky);
        test_hot_usual_cocoa.addZephyr(marsh_starbucks);

        cocoa_calories += zephirky.getCalories(milk_quan);
        cocoa_calories += marsh_starbucks.getCalories(milk_quan);

        //THEN
        assertTrue(test_hot_usual_cocoa.getCalories() == cocoa_calories);
    }

    @Test
    public void addZephyrNotEmptyList() {
        //WHAT
        Sugar cafe_sugar = new Sugar(1115, 100, true, SugarType.Sanding, 2);
        Cocoa test_hot_usual_cocoa = new Cocoa(500, 200, cafe_sugar);
        Marshmallow zephirky = new Marshmallow(1815, 86, true,
                cafe_sugar.getSugarType(), 25, "зефирки к какао");
        Marshmallow marsh_starbucks = new Marshmallow(712, 65, true,
                SugarType.Pearl, 5, "маршмеллоу в какао");

        //WHAT
        test_hot_usual_cocoa.addZephyr(zephirky);
        test_hot_usual_cocoa.addZephyr(marsh_starbucks);

        //THEN
        assertTrue(test_hot_usual_cocoa.getSize() == 2);
    }
}