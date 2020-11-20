public class RubberDuck extends Duck{
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
