package com.vrx.spring.springcoreapp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("carnival") // tells spring to create object for this class
//@Primary // gives priority to the class for dependency injection
public class CarnivalMovies implements  MovieFinder{
    @Override
    public String getMovies() {
        return "Carnival Movie: Amazing Spiderman";
    }
}
