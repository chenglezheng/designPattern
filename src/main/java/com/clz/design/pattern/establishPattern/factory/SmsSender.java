package com.clz.design.pattern.establishPattern.factory;

public class SmsSender implements Sender{
    public void send() {
        System.out.println("send Sms!");
    }
}
