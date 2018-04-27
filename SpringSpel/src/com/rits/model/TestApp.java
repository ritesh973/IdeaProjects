package com.rits.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
//	BookLibrary library = context.getBean("bookLibrary",BookLibrary.class);
//	for (Book book : library.getAllBooks()) {
//		System.out.println(book.getBookName()+"----"+book.getBookId());
//	}
	RandomNumberGenerator generator = context.getBean("randomGenerator",RandomNumberGenerator.class);
	System.out.println(generator.getRandomNumber()+"------"+generator.getPi());
	
	

}
}
