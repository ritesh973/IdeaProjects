
package com.rits.dependencyinjection;

public class Communication {

	private Message message;
//	public Communication(Message message) {
//		this.message = message;
//	}
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public void sendMessage(){
		message.sendMessage();
	}
}
