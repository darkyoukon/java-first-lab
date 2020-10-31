package ConfectioneryPack;

public class Sugar extends Confection {
    private final SugarType sugarType;
    private int spoons;

    public Sugar(long _number, float _calories, boolean _availability, SugarType sugar, int quantity) {
        super(_number, _calories, _availability);
        System.out.println("Used " + sugar.curIndexValue() + " sugar briquette.");
        sugarType = sugar;
        spoons = quantity;
    }

    public SugarType getSugarType() { return sugarType; }
}
