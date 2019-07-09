package com.clz.design.pattern.behaviorPattern.visitor;

public class MySubject implements Subject{

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "chenglezheng";
    }
}
