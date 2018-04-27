package com.rits.beaninheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgram {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
	Employee employee = context.getBean("employee",Employee.class);
	System.out.println(employee.getName()+"---"+employee.getGender()+"---"+employee.getPanNo());
}
}
