package com.satyakm.sprngbootjokeapp.controller;

import com.satyakm.sprngbootjokeapp.service.JokeService;
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
        return "chucknorris".substring(0,5);
    }
}
