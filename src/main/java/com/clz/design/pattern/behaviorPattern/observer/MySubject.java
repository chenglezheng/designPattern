package com.clz.design.pattern.behaviorPattern.observer;

public class MySubject extends AbstractSubject{
    public void operation() {
        System.out.println("update myself!");
        notifyObservers();
    }
}
