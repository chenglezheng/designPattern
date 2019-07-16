package strategy;

public class Test {
    public static void main(String[] args) {
        Duck duck=new ModelDuck();
        FlyBehavior flyBehavior=new FlyWithWings();
        duck.performFly();
        duck.setFlyBehavior(flyBehavior);
        duck.performFly();
        duck.performQuack();
        /*
        *策略模式定义了算法族，分别封装起来，
        * 让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
        * */
    }
}
