package ConfectioneryPack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Order yours_order = formOrder();
        repeatYourOrder(yours_order);
        if(yours_order.checkSugarSufficiency(SugarType.Sanding)) {
            System.out.println("Warning! You have an allergy to sugar that is in yours order!");
        }

        System.out.println();
        System.out.println(SugarType.Confectioners.toString());

        Confection sample1 = new Sugar(1, 1, true, SugarType.Sanding, 10);
        Confection sample2 = new Sugar(1, 1, true, SugarType.Sanding, 10);
        if(!sample1.equals(sample2)) {
            System.out.println("Sugar classes aren't equal coz pointers refers to different references.");
        }

        Confection sample3 = new Flour(1, 1, true, FlourType.Wheat);
        Confection sample4 = new Flour(1, 1, true, FlourType.Wheat);
        if(sample3.equals(sample4)) {
            System.out.println("Flour classes are equal coz of rewritten equals logic.");
        }
    }

    private static Order formOrder() {
        Sugar cafe_sugar = new Sugar(1115, 100, true, SugarType.Sanding, 2);
        Cocoa cocoa = new Cocoa(500, 120, cafe_sugar);

        Marshmallow zephirky = new Marshmallow(1815, 86, true,
                                               cafe_sugar.getSugarType(), 25, "зефирки к какао");
        Marshmallow marsh_starbucks = new Marshmallow(712, 65, true,
                SugarType.Pearl, 5, "маршмеллоу в какао");
        cocoa.addZephyr(zephirky);
        cocoa.addZephyr(marsh_starbucks);

        String [] layers = {"Chocolate", "Flour"};
        String [] layers_second = {"Usual", "Jelly", "Fantastic"};
        try {
            Biscuit cafe_biscuit = new Biscuit(312,  330, true,
                    FlourType.Wholegrain, 2, layers);

            Order order = new Order(cocoa, cafe_biscuit);
            order.addBiscuit(new Biscuit(313,  150, true,
                    FlourType.Rye, 4, layers_second));
            return order;
        } catch (DataValidationException err) {
            err.printStackTrace();
            System.out.println("Difference between written manually layers quan and array length is " + err.getInsufficientQuantity());
            System.exit(1);
        }
        return null;
    }

    private static void repeatYourOrder(Order order) {
        System.out.println(order.toString());
        for(int i = 0; i < order.getCocoas().size(); ++i) {
            System.out.println(order.getCocoas().get(i).toString());
        }

        for(int i = 0; i < order.getBiscuits().size(); ++i) {
            if (i != order.getBiscuits().size() - 1) {
                System.out.println(order.getBiscuits().get(i).toString());
            } else {
                System.out.println( order.getBiscuits().get(i).toString().split("(?=:).+")[0]
                        .concat(String.valueOf(Character.toChars(33))));
            }
        }
    }
}
