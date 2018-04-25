package com.rits.SpringBootApp.controllers;

import com.rits.SpringBootApp.model.Users;
import com.rits.SpringBootApp.repositories.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping("/users")
    public List<Users> findAll(){
        return userJpaRepository.findAll();
    }

    @GetMapping("/{name}")
    public Users findByName(@PathVariable final  String name){
        return userJpaRepository.findByName(name);

    }

    @PostMapping(value = "/load")
    public Users load(@RequestBody Users users){
        userJpaRepository.save(users);
        return userJpaRepository.findByName(users.getName());

    }


}

