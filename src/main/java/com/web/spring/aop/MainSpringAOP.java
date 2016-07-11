package com.web.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.spring.aop.service.EmployeeService;

public class MainSpringAOP {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-configuration.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("Pankaj");
		employeeService.getEmployee().throwException();	
		ctx.close();
	}
	
}