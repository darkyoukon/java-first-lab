package ConfectioneryPack;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order extends Confection {
    private ArrayList<Cocoa> cocoas;
    private ArrayList<Biscuit> biscuits;
    private static int product_num = 0;

    public Order() {
        super(++product_num, 0);
        cocoas = new ArrayList<>();
        biscuits = new ArrayList<>();
    }

    public Order(Cocoa coc, Biscuit bisc) {
        super(++product_num, coc.getCalories()+bisc.getCalories());
        cocoas = new ArrayList<>();
        biscuits = new ArrayList<>();

        cocoas.add(coc);
        biscuits.add(bisc);
    }

    public Order(Cocoa coc) {
        super(++product_num, coc.getCalories());
        cocoas = new ArrayList<>();
        biscuits = new ArrayList<>();
        cocoas.add(coc);
    }

    public void addCocoa(Cocoa coc) {
        super.addCalories(coc.getCalories());
        cocoas.add(coc);
    }
    public void addBiscuit(Biscuit bisc) {
        super.addCalories(bisc.getCalories());
        biscuits.add(bisc);
    }

    public ArrayList<Cocoa> getCocoas() {
        return cocoas;
    }
    public ArrayList<Biscuit> getBiscuits() {
        return biscuits;
    }

    @Override
    public String toString() {
        return "Yours order consists of " + cocoas.size() + " cups of cocoas, "
                + biscuits.size() + " biscuits.";
    }

    public boolean checkSugarSufficiency(SugarType type_to_check) {
        Iterator checkingCocoa = cocoas.iterator();
        while(checkingCocoa.hasNext()) {
            Cocoa coc = (Cocoa)checkingCocoa.next();
            Sugar to_check = coc.getSugaride();
            return to_check.getSugarType() != type_to_check;
        }
        return false;
    }

    //lambda expressions
    public String getPopSugMarshmallowType() {
        return cocoas.stream()
                .flatMap(marsh -> marsh.getZephyr().stream())
                .max(Comparator.comparing(Sugar::getSugarType)).get().getSugarType().curIndexValue();
    }
}
