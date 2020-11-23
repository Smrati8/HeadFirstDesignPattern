package ch4DesignPattern;

import java.util.ArrayList;

abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding Sauce " + sauce);
        System.out.println("Adding toppings: ");
        for(String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official Pizza Store box");
    }

    public String getName(){
        return this.name;
    }
}
