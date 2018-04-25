package com.rits.SpringBootApp.controllers;

import com.rits.SpringBootApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        System.out.print("------------Called----------");
        model.addAttribute("authors",authorRepository.findAll());

        return "authors";

    }
}
