package patos;

public class RedHeadDuck extends Duck{
    
    public RedHeadDuck (){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("I'm a red head duck");
    }
    
}
