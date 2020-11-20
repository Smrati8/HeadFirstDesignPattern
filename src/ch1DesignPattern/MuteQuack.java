package ch1DesignPattern;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Mute ch1DesignPattern.Quack");
    }
}
