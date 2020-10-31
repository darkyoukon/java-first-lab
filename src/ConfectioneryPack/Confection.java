package ConfectioneryPack;

public abstract class Confection implements CaloriesMutable {
    protected long product_num;
    protected float calories;
    protected boolean availability;

    public Confection(long _number, float _calories, boolean _availability) {
        product_num = _number;
        calories = _calories;
        availability = _availability;
    }

    public Confection(long _number, float _calories) {
        product_num = _number;
        calories = _calories;
        availability = true;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void addCalories(float _calories) {
        this.calories += _calories;
    }
    public float getCalories(float weight) {
        return this.calories * weight;
    }
    public float getCalories() { return this.calories; }

    public void changeProductNum(long product_num) {
        this.product_num = product_num;
    }

    public long seeProductNum() {
        return product_num;
    }
}
