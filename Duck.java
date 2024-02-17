package patos;

public abstract class Duck {
    FlyBahavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }
    public abstract void display();

    public void swim  (){
        System.out.println("All ducks float, even decoys!");
    }
    
    public void setFlyBehavior(FlyBahavior fb){

        flyBehavior = fb;

    }

    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior=qb;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void showDuck(){
        display();
        performFly();
        performQuack();
        swim();

    }
}
