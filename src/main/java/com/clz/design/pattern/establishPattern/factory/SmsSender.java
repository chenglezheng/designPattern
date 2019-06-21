package com.clz.design.pattern.establishPattern.factory;

public class SmsSender implements Sender{
    public void Send() {
        System.out.println("send Sms!");
    }
}
