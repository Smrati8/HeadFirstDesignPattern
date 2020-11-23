package ch4DesignPattern;

public class PizzaTestDrive {
    public static void main(String[] arg) {
        PizzaStore ps1 = new NYPizzaStore();
        PizzaStore ps2 = new ChicagoPizzaStore();

        Pizza pizza = ps1.orderPizza("Cheese");
        System.out.println("Ethan Ordered a " + pizza.getName() + "\n");

        pizza = ps2.orderPizza("Veggie");
        System.out.println("Joel Ordered a " + pizza.getName() + "\n");
    }
}
