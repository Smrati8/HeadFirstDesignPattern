package ch4DesignPattern;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into Square slices");
    }
}
