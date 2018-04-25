package com.rits.coreexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Say hello primary greeting service";
    }
}
