package com.rits.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanconfigurer.xml");
		Message message = applicationContext.getBean("message",Message.class);
		System.out.println(message.getName());
		applicationContext.close();
	}
}
