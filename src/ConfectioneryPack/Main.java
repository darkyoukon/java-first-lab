package ConfectioneryPack;

public class Main {

    public static void main(String[] args) {
        Order yours_order = formOrder();
        repeatYourOrder(yours_order);
        if(yours_order.checkSugarSufficiency(SugarType.Sanding)) {
            System.out.println("Warning! You have an allergy to sugar that is in yours order!");
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
        Biscuit cafe_biscuit = new Biscuit(312,  330, true,
                                           FlourType.Wholegrain, 2, layers);

        String [] layers_second = {"Usual", "Jelly"};
        Order order = new Order(cocoa, cafe_biscuit);
        order.addBiscuit(new Biscuit(313,  150, true,
                FlourType.Rye, 3, layers_second));
        return order;
    }

    private static void repeatYourOrder(Order order) {
        System.out.println(order.toString());
        for(int i = 0; i < order.getCocoas().size(); ++i) {
            System.out.println(order.getCocoas().get(i).toString());
        }

        for(int i = 0; i < order.getBiscuits().size(); ++i) {
            System.out.println(order.getBiscuits().get(i).toString());
        }
    }
}
