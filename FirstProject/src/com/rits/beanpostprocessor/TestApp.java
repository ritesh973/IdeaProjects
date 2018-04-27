package com.rits.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
		Message1 message = context.getBean("message",Message1.class);
		System.out.println(message.getMessage());
		context.close();
	}
}
