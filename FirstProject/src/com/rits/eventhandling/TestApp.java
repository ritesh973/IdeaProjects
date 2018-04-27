package com.rits.eventhandling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
		CustomEventPublisher message = context.getBean("customeEventPublisher",CustomEventPublisher.class);
		message.publishEvent();
		//System.out.println(message.getMessage()+"----"+message.getMessageId());
		context.close();
	}
}
