package patos;

public class DuckTest {
    public static void main(String args[]){
        Duck mallarDuck, redHead, decoyDuck, rubberDuck, rocket;

        mallarDuck = new MallarDuck();
        mallarDuck.showDuck();

        redHead = new RedHeadDuck();
        redHead.showDuck();

        decoyDuck = new DecoyDuck();
        decoyDuck.showDuck();

        rubberDuck=new RubberDuck();
        rubberDuck.showDuck();

        rocket = new ModelDuck();
        rocket.showDuck();
        System.exit(0);
    }
}
