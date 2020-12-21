package ConfectioneryPack;

public enum SugarType {
    Confectioners,
    Pearl,
    Sanding,
    Cane,
    Demerara;

    @Override
    public String toString() {
        StringBuilder enum_to_string = new StringBuilder();
        enum_to_string.append("List of all SugarType values: ");
        for(SugarType sugar_type: SugarType.values()) {
            enum_to_string.append(sugar_type.curIndexValue());
            if(sugar_type != Demerara) {
                enum_to_string.append(", ");
            }
        }
        enum_to_string.append(".");
        return enum_to_string.toString();
    }

    public String curIndexValue() {
        StringBuilder simple_upper_name = new StringBuilder("[");
        return simple_upper_name.append(this.ordinal()).append("] ").append(this.name().toUpperCase()).toString();
    }
}