package com.clz.design.pattern.establishPattern.singleton;

public class SingletonExcellent {

    private static SingletonExcellent instance=null;


    private SingletonExcellent(){

    }

    private static synchronized  void syncInit(){
        if (instance==null){
            instance=new SingletonExcellent();
        }
    }

    public static SingletonExcellent getInstance(){
        if (instance==null){
            syncInit();
        }
        return instance;
    }

}
