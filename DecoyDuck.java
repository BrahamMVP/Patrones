package patos;

public class DecoyDuck extends  Duck{

    public DecoyDuck(){
        flyBehavior = new FlyNoway();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("I'm decoy duck");
    }
    
}
