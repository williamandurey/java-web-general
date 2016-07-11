package com.spring.di.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.web.spring.di.consumer.MyApplicationWithAnnotation;
import com.web.spring.di.service.MessageService;

@Configuration
@ComponentScan(value="com.web.spring.di.consumer")
public class ClientApplicationWithAnnotationTest {
	
	private AnnotationConfigApplicationContext context = null;

	@Bean
	public MessageService getMessageService() {
		return new MessageService(){
			public boolean sendMessage(String msg, String rec) {
				System.out.println("Mock Service");
				return true;
			}
			
		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(ClientApplicationWithAnnotationTest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		MyApplicationWithAnnotation app = context.getBean(MyApplicationWithAnnotation.class);
		Assert.assertTrue(app.processMessage("Annotation injection test", "spring@william.com"));
	}

}
