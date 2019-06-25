package com.clz.design.pattern.establishPattern.abstractFactory;

public class SendMailFactory implements Provider{

    public Sender produce() {
        return new MailSender();
    }
}
