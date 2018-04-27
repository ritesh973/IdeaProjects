package com.rits.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent>{

	
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context start event received");
		System.out.println(event.getSource());
		
	}

}
