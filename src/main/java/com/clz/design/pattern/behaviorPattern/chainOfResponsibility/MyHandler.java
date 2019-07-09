package com.clz.design.pattern.behaviorPattern.chainOfResponsibility;

public class MyHandler extends AbstractHandler implements Handler{

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public void operator() {
        System.out.println(name+"deal!");
        if (getHandler()!=null){
            getHandler().operator();
        }
    }
}
