package ch1DesignPattern;

public class MiniDuckSimulator {
    public static void main(String[] arg) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
