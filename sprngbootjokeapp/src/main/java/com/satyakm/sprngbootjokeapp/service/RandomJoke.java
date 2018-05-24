package com.satyakm.sprngbootjokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomJoke implements  JokeService{

    @Override
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
