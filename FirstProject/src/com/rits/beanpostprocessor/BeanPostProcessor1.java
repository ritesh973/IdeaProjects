package com.rits.beanpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor1 implements BeanPostProcessor,Ordered{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName){
		System.out.println("Bean Initializing: "+beanName);
		return bean;
	}
	@Override
	 public Object postProcessAfterInitialization(Object bean, String beanName) 
	 {
		System.out.println("Bean Destroying: "+beanName);
		 return bean;
	 }
	@Override
	public int getOrder() {
		return 1;
	}
}
