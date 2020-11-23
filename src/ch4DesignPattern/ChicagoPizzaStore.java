package ch4DesignPattern;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory;
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if(type.equals("Veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if(type.equals("Clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if(type.equals("Pepperoni")){
            pizza = new PepperoniPiza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
