package ch4DesignPattern;

public class ChicagoStylePepperoniPizza extends Pizza{

    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese n Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into Square slices");
    }
}
