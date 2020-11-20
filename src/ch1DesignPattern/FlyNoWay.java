package ch1DesignPattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly No way");
    }
}
