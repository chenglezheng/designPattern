package com.clz.design.pattern.constructionPattern.adapter.classAdapter;

public class Adapter extends Source implements Targetable{

    public void method2() {
        System.out.println("This is the targetable!");
    }
}
