package ConfectioneryPack;

import java.util.ArrayList;
import java.util.Collection;

public class DataValidationException extends Exception {
    ArrayList<Integer> error_length;

    DataValidationException(String message, int code_length, int array_length) {
        super(message);
        error_length = new ArrayList<>(2);
        error_length.add(code_length);
        error_length.add(array_length);
    }

    public int getInsufficientQuantity() {
        return Math.abs(error_length.get(1) - error_length.get(0));
    }
}
