package com.rits.coreexample.controller;

import com.rits.coreexample.services.GreetingService;
import com.rits.coreexample.services.PrimaryGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectorController {




    private GreetingService greetingService;

    @Autowired
    @Qualifier("greetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }



    public String getMessage(){
        return this.greetingService.sayHello();
    }
}
