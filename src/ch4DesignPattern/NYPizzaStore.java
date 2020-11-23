package ch4DesignPattern;

public class NYPizzaStore extends PizzaStore{
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equals("Veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if(type.equals("Clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if(type.equals("Pepperoni")){
            pizza = new PepperoniPiza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } 
        return pizza;
    }
}
