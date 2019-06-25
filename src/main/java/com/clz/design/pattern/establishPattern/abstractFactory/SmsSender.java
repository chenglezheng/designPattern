package com.clz.design.pattern.establishPattern.abstractFactory;

public class SmsSender implements Sender{
    public void send() {
        System.out.println("send Sms!");
    }
}
