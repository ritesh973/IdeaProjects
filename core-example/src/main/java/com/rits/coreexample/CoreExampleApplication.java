package com.rits.coreexample;

import com.rits.coreexample.controller.GetterInjectorController;
import com.rits.coreexample.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreExampleApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(CoreExampleApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		System.out.println("-----------Message-----------------"+controller.sayHello());


		GetterInjectorController getterInjectorController = (GetterInjectorController) context.getBean("getterInjectorController");

		System.out.println("Getter Injector: \n"+getterInjectorController.getMessage());


		for (int i=0;  true; i++) {
			System.out.println("hii");

		}

	}
}

