package ConfectioneryPack;

import java.util.ArrayList;
import java.util.Arrays;

public class Biscuit extends Flour {
    private Layer layer;

    public Biscuit(int _number, float _calories, boolean _availability, FlourType flour, int l_quan, String[] l_types)
            throws DataValidationException {
        super(_number, _calories, _availability, flour);
        if(l_quan != l_types.length) {
            throw new DataValidationException("Unequal constructor layers params!", l_quan, l_types.length);
        }
        layer = new Layer(l_quan, l_types);
    }

    @Override
    public float getCalories() {
        if (super.getFlourType() == FlourType.Wheat || super.getFlourType() == FlourType.Porridge) {
            return super.getCalories();
        } else {
            return (float)1.5 * super.getCalories();
        }
    }

    public String getAllLayers() {
        return String.join(", ", layer.layers_types);
    }
    public int get_layers_quantity() { return layer.get_layer_quantity(); }

    @Override
    public String toString() {
        return "There're " + layer.layers_quantity + " total layers in yours biscuit: " + this.getAllLayers();
    }

    private class Layer {
        private int layers_quantity;
        private ArrayList<String> layers_types;

        public Layer(int quantity, String[] types) {
            layers_quantity = quantity;
            layers_types = new ArrayList<>();
            for(String temp: types) {
                layers_types.add(temp);
            }
        }

        public int get_layer_quantity() { return layers_quantity; }
    }
}
