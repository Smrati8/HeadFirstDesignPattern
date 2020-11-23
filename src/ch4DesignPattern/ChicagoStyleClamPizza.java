package ch4DesignPattern;

public class ChicagoStyleClamPizza extends Pizza{

    public ChicagoStyleClamPizza(){
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese n Clam");
    }

    void cut() {
        System.out.println("Cutting the pizza into Square slices");
    }
}
