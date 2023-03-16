package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.EmailService;
import com.example.demo.service.MessageService;
import com.example.demo.service.SMSService;

@Configuration
@ComponentScan(value={"com.example.demo.consumer"})
public class DIConfiguration {

    @Bean
	public MessageService getMessageService(){
		return new SMSService();
	}
}
