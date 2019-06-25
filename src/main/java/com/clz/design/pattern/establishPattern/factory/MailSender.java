package com.clz.design.pattern.establishPattern.factory;

public class MailSender implements Sender{
    public void send() {
        System.out.println("send Mail!");
    }
}
