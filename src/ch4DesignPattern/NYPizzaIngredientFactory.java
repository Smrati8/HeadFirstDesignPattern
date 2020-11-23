package ch4DesignPattern;

import java.util.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianeCheese();
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
        return new FrozenClams();
    }
}
