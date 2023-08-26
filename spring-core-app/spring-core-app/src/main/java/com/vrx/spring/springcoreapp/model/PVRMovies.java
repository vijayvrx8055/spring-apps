package com.vrx.spring.springcoreapp.model;

import org.springframework.stereotype.Component;

@Component("pvr")
public class PVRMovies implements MovieFinder{
    @Override
    public String getMovies() {
        return "PVR Movie : Avatar";
    }
}
