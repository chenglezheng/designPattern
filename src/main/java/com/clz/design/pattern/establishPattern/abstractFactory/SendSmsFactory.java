package com.clz.design.pattern.establishPattern.abstractFactory;

public class SendSmsFactory implements Provider{

    public Sender produce() {
        return new MailSender();
    }
}
