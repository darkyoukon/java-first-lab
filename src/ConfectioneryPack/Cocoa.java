package ConfectioneryPack;

import java.util.ArrayList;

public class Cocoa {
    private ArrayList<Marshmallow> zephyr;
    private Sugar sugaride;
    private int milk_ml;
    private float calories;

    public Cocoa(int milk_quantity, float _calories, Sugar _sugar) {
        milk_ml = milk_quantity;
        calories = _calories;
        zephyr = new ArrayList<>();
        sugaride = _sugar;
    }

    public int getCupSize() { return milk_ml; }
    public float getCalories() {
        float cal_temp = calories;
        for(Marshmallow temp: zephyr) {
            cal_temp += temp.getCalories(milk_ml);
        }
        return cal_temp;
    }

    public void addZephyr(Marshmallow marshmallow) {
        zephyr.add(marshmallow);
    }

    public Sugar getSugaride() { return sugaride; }
    public int getSize() { return zephyr.size(); }

    @Override
    public String toString() {
        return "Cup of cocoa consists of " + calories + " ccal, "
                + milk_ml + " ml of milk.";
    }
}
