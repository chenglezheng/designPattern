package com.clz.design.pattern.constructionPattern.bridge;

public class MyBridge extends Bridge{

    public void method(){
        getSourceable().method();
    }
}
