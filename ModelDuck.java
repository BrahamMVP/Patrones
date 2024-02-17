package patos;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display(){
        System.out.println("I'm model duck");
    }
}
