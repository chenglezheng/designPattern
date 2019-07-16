package strategy;

public class ModelDuck extends Duck{
    public void display() {
        System.out.println("I am a ModelDuck!");
    }

    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Silence();
    }
}
