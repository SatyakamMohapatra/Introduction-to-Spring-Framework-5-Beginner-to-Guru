package com.satyakm.Spring5WebProject.controllers;

import com.satyakm.Spring5WebProject.repositories.AuthorRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorsController {

    private AuthorRepositories authorRepositories;

    public AuthorsController(AuthorRepositories authorRepositories) {
        this.authorRepositories = authorRepositories;
    }

    @RequestMapping("/authors")
    public String getAuthorList(Model model){
        model.addAttribute("authors",authorRepositories.findAll());
        return "authors";
    }
}
