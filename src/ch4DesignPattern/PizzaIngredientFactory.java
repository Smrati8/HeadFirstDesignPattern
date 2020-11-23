package ch4DesignPattern;

import java.util.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public List<String> createVegetables();
    public Clams createClams();
}
