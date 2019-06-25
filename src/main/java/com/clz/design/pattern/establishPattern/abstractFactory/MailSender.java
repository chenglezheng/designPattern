package com.clz.design.pattern.establishPattern.abstractFactory;


public class MailSender implements Sender {
    public void send() {
        System.out.println("send Mail!");
    }
}
