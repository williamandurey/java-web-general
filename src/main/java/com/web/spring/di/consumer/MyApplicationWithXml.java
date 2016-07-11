package com.web.spring.di.consumer;

import com.web.spring.di.service.MessageService;

public class MyApplicationWithXml {

	// field-based dependency injection
	private MessageService service;
	
	// constructor-based dependency injection
	/*
	public MyApplicationWithXmlConfiguration(MessageService service) {
		this.service = service;
	}
	*/
	
	//setter-based dependency injection
	public void setService(MessageService svc){
		this.service=svc;
	}
	
	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}
	
}
