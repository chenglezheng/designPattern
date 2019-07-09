package com.clz.design.pattern.behaviorPattern.mediator;

public abstract class User {

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
