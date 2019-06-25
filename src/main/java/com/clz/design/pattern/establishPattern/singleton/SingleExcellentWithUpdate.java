package com.clz.design.pattern.establishPattern.singleton;

import java.util.Vector;

public class SingleExcellentWithUpdate {

    private static SingleExcellentWithUpdate instance=null;
    private Vector properties=null;

    private Vector getProperties(){
        return properties;
    }

    private SingleExcellentWithUpdate(){

    }

    private static synchronized void syncInit(){
        if (instance==null){
            instance=new SingleExcellentWithUpdate();
        }
    }

    public static SingleExcellentWithUpdate getInstance(){
        if (instance==null){
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        SingleExcellentWithUpdate shadow=new SingleExcellentWithUpdate();
        properties=shadow.getProperties();
    }
}
