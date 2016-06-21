package com.william.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.william.spring.di.service.MessageService;

@Component
public class MyApplicationWithAnnotation {

	// field-based dependency injection
	//@Autowired
	private MessageService service;
	
	// constructor-based dependency injection
	/*
	@Autowired
	public MyApplicationWithAnnotation(MessageService service) {
		this.service = service;
	}
	*/
	
	// method-based dependency injection
	@Autowired
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public boolean processMessage(String msg, String rec){
		return this.service.sendMessage(msg, rec);
	}	
	
}
