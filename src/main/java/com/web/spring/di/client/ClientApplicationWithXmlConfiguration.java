package com.web.spring.di.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.spring.di.consumer.MyApplicationWithXml;

public class ClientApplicationWithXmlConfiguration {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		MyApplicationWithXml app = context.getBean(MyApplicationWithXml.class);
		app.processMessage("XML based injection", "spring@william.com");
		context.close();
	}
	
}
