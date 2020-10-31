package ConfectioneryPack;

import java.util.Objects;

public class Flour extends Confection {
    private final FlourType flourType;

    public Flour(int _number, float _calories, boolean _availability, FlourType flour) {
        super(_number, _calories, _availability);
        flourType = flour;
    }

    public FlourType getFlourType() { return flourType; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flour other = (Flour) obj;
        return hashCode() == other.hashCode(); // ключевое сравнение
    }

    @Override
    public int hashCode() {
        return product_num;
    }
}
