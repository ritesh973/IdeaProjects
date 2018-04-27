package com.rits.collectioninjection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("beanconfigurer.xml");
		OriginInfo info = abstractApplicationContext.getBean("orgInfo",OriginInfo.class);
		for (Student student : info.getNames()) {
			System.out.println("StudentId: "+student.getSid()+"-Student Name: "+student.getName()+" Student gender: "+student.getGender());
			
		}
		for (Student student : info.getStudList()) {
			System.out.println("StudentId: "+student.getSid()+"-Student Name: "+student.getName()+" Student gender: "+student.getGender());
			
		}
		Map<Integer, String> map = info.getStudenMap();
				for (Entry<Integer,String> entry : map.entrySet()) {
					System.out.println(entry.getKey()+"-----"+entry.getValue());
				}
				Properties data = info.getProperties();
				System.out.println(data.getProperty("password"));
//		for (String employee : info.getEmployeeList()) {
//			System.out.println("Employee: "+employee);
//		}
//		for (Integer id : info.getEmpIdsSet()) {
//			System.out.println("Id : "+id);
//			
//		}
		abstractApplicationContext.close();
	}
}
