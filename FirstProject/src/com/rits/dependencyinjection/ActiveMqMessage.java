package com.rits.dependencyinjection;


public class ActiveMqMessage implements Message {

	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("Sending greeting!!!"+message);
	}
}
