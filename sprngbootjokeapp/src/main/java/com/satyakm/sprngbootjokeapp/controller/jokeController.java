package com.satyakm.sprngbootjokeapp.controller;

import com.satyakm.sprngbootjokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {

    private JokeService jokeService;

    public jokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        System.out.println(jokeService.getJoke());
        return "chucknorris";
    }
}
