package ConfectioneryPack;

public class Marshmallow extends Sugar {
    private int quantity;
    private String marsh_type;

    public Marshmallow(long _number, float _calories, boolean _availability, SugarType sugar, int quantity, String m_type) {
        super(_number, _calories, _availability, sugar, quantity);
        this.quantity = quantity;
        this.marsh_type = m_type;
    }


}
