package com.example.demo.service;

public class EmailService implements MessageService {

    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email Sent Successfull");
        return true;
    }
    
}
