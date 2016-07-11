package com.web.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.web.spring.di.service.EmailService;
import com.web.spring.di.service.MessageService;

@Configuration
@ComponentScan(value={"com.william.spring.di.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
	
}
