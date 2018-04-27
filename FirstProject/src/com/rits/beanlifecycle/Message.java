package com.rits.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
private String name;
public String getName() {
	System.out.println("setting value");
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private String id;

@PostConstruct
public void create() throws Exception {
System.out.println("Beaninitialized");	
}
@PreDestroy
public void destroy() throws Exception {
	System.out.println("Bean destroyed");
	
}
}
