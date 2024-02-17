package patos;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoway();
    }

    @Override
    public void display(){
        System.out.println("I'm a rubber duck");
    }
    
}
