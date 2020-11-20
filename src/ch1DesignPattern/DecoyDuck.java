package ch1DesignPattern;

public class DecoyDuck extends Duck{
    public void quack(){

    }

    public void fly(){

    }
    @Override
    public void display(){
        System.out.println("Decoy ch1DesignPattern.Duck");
    }
}
