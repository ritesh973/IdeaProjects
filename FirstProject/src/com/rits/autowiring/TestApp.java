package com.rits.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanconfigurer.xml");
		Employee employee = context.getBean("employee",Employee.class);
		if (employee!=null) {
			System.out.println(employee.getEmpName()+"--"+employee.getPanCard().getPanNo());
		}
		context.close();
	}
}
