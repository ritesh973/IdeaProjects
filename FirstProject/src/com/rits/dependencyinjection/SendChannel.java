package com.rits.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SendChannel {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
	Communication communication = context.getBean("communication",Communication.class);
	communication.sendMessage();
}
}
