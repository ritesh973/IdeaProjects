package com.rits.eventhandling;

import org.springframework.context.ApplicationListener;

public class CustomEvenetHandler implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent cutomEvent) {
		
      System.out.println(cutomEvent.toString());		
	}

}
