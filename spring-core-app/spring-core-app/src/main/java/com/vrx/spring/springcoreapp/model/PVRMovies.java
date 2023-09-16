package com.vrx.spring.springcoreapp.model;

import org.springframework.stereotype.Component;

@Component("pvr") // tells spring to create and manage object
public class PVRMovies implements MovieFinder{
    @Override
    public String getMovies() {
        return "PVR Movie : Avatar";
    }
}
