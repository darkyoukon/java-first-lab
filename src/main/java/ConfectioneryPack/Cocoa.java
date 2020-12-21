package ConfectioneryPack;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
    public ArrayList<Marshmallow> getZephyr() { return zephyr; }

    public void changeSugarCharacteristics(SugarType _sugar_type, int _spoons) {
        sugaride.changeSugarType(_sugar_type);
        sugaride.changeSugarSpoons(_spoons);
    }

    public Sugar getSugaride() { return sugaride; }
    public int getSize() { return zephyr.size(); }

    @Override
    public String toString() {
        return "Cup of cocoa consists of " + calories + " ccal, "
                + milk_ml + " ml of milk.";
    }

    private DoubleStream getAllCalories() {
        return zephyr.stream()
                .filter(instan -> instan.getCalories() > 0) // check if there wasn't mistake with negative calories
                .mapToDouble(Confection::getCalories);
    }

    //lambda expressions
    public Double getTotalCalories() {
        return getAllCalories().sum() +
                sugaride.getCalories() + calories;
    }

    public Marshmallow getMarshmallowMaxCalorific() {
        return zephyr.stream()
                .reduce((x, y) -> x.getCalories() >= y.getCalories() ? x : y).orElse(null);
    }

    public Double getAverageCalories() {
        return getAllCalories().average().orElse(0);
    }

    private Consumer<SugarType> printConsumer() {
        return t -> System.out.println(t + " ");
    }

    public Map<String, List<Marshmallow>>
    getAppropriateSugarideOfMarshmallow(SugarType classifier) {
        return zephyr
                .stream()
                .collect(Collectors.groupingBy(t -> t.getSugarType() == classifier ?
                        t.getSugarType().curIndexValue() + " appropriate" :
                        t.getSugarType().curIndexValue() + " isn't appropriate"));
    }
}
