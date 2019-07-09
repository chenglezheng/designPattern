package com.clz.design.pattern.behaviorPattern.mediator;

public class User1 extends User{

    public User1(Mediator mediator){
        super(mediator);
    }

    public void work() {
        System.out.println("user1 exe!");
    }
}
