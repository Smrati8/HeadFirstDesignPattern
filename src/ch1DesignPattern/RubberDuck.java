package ch1DesignPattern;

public class RubberDuck extends Duck{
    public void quack() {
        System.out.println("ch1DesignPattern.Squeak");
    }

    @Override
    public void display() {
        System.out.println("Rubber ch1DesignPattern.Duck");
    }
}
