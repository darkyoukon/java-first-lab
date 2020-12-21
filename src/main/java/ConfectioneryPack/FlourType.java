package ConfectioneryPack;

public enum FlourType {
    Wheat("WHE"),
    Wholegrain("WHO"),
    Rye("RYE"),
    Rice,
    Porridge("POR");

    public String str_type;

    FlourType() {}

    FlourType(String name) {
        str_type = name;
    }
}