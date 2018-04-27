package com.rits.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rits.Message;

public class MyApplication {
public static void main(String[] args) {
//	Resource resource = new ClassPathResource("beanconfigurer.xml");
//	BeanFactory factory = new XmlBeanFactory(resource);
//	Message message = factory.getBean(Message.class);//factory.getBean("message", Message.class);
//	System.out.println(message.getMessage());
//	System.out.println(message.getMessageId());
//	
	ApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
	System.out.println(context.getBean("message",Message.class).getMessage());
//	System.out.println(context.getBean("message",Message.class).hashCode());
//	System.out.println(context.getBean("message",Message.class).hashCode());
}
}
