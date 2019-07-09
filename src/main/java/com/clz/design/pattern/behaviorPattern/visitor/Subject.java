package com.clz.design.pattern.behaviorPattern.visitor;

public interface Subject {

    public void accept(Visitor visitor);

    public String getSubject();
}
