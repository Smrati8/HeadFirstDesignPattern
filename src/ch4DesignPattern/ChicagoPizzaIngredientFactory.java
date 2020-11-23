package ch4DesignPattern;

import java.util.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSuace();
    }

    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public List<String> createVegetables(){
        List<String> result = new ArrayList<String>();
        result.add("Mushroom");
        result.add("Spinach");
        result.add("Tomato");
        result.add("Onion");
        result.add("Jalapeno");
        result.add("Red Pepper");
        return result;
    }

    public Clams createClams(){
        return new FreshClams();
    }
}

