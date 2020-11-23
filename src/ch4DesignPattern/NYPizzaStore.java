package ch4DesignPattern;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new NyStyleCheesePizza();
        } else if(type.equals("Veggie")) {
            return new NYStyleVeggiePizza();
        } else if(type.equals("Clam")) {
            return new NYStyleClamPizza();
        } else if(type.equals("Pepperoni")){
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
