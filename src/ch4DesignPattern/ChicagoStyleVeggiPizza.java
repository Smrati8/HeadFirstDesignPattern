package ch4DesignPattern;

public class ChicagoStyleVeggiPizza extends Pizza{

    public ChicagoStyleVeggiPizza(){
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese n Veggie");
    }

    void cut() {
        System.out.println("Cutting the pizza into Square slices");
    }
}
