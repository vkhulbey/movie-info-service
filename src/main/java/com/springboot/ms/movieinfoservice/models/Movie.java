package com.springboot.ms.movieinfoservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    private String movieId;
    private String name;
    private String desc;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public Movie(String movieId, String name, String desc) {
        this.movieId = movieId;
        this.name = name;
        this.desc = desc;
    }
}
