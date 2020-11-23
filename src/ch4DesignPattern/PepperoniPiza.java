package ch4DesignPattern;

public class PepperoniPiza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPiza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVegetables();
    }
}
