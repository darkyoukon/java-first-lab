package ConfectioneryPack;

public class Sugar extends Confection {
    private SugarType sugarType;
    private int spoons;

    public Sugar(int _number, float _calories, boolean _availability, SugarType sugar, int quantity) {
        super(_number, _calories, _availability);
        System.out.println("Used " + sugar.curIndexValue() + " sugar briquette.");
        sugarType = sugar;
        spoons = quantity;
    }

    public SugarType getSugarType() { return sugarType; }

    public void changeSugarType(SugarType _sugarType) {
        this.sugarType = _sugarType;
    }

    public void changeSugarSpoons(int _spoons) {
        this.spoons = _spoons;
    }
}
