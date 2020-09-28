package ConfectioneryPack;

public class Sugar extends Confection {
    private final SugarType sugarType;
    private int spoons;

    public Sugar(long _number, float _calories, boolean _availability, SugarType sugar, int quantity) {
        super(_number, _calories, _availability);
        sugarType = sugar;
        spoons = quantity;
    }

    public SugarType getSugarType() { return sugarType; }
}
