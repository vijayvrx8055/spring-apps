package com.vrx.spring.springcoreapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieListener {

    @Autowired // Spring Autowires the related dependency
    @Qualifier("pvr") //tells spring to add dependency of this name in case of ambiguity
    private MovieFinder movieFinder;

//    public MovieListener(MovieFinder movieFinder){
//        this.movieFinder=movieFinder;
//    }

    public void printMovie(){
        String movie = movieFinder.getMovies();
        System.out.println(movie);
    }
}
