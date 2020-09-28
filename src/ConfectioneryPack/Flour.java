package ConfectioneryPack;

public class Flour extends Confection {
    private final FlourType flourType;

    public Flour(long _number, float _calories, boolean _availability, FlourType flour) {
        super(_number, _calories, _availability);
        flourType = flour;
    }

    public FlourType getFlourType() { return flourType; }

}
