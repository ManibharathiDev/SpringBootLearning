package com.example.demo.service;

public class SMSService implements MessageService {

    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("SMS Sent Successfully");
        return true;
    }
    
}
