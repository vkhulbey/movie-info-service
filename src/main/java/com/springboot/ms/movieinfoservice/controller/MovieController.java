package com.springboot.ms.movieinfoservice.controller;

import com.springboot.ms.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        Optional<Movie> movie = getMovieListList()
                .stream()
                .filter(mv -> mv.getMovieId().equals(movieId))
                .findFirst();

        return movie.orElseGet(() -> new Movie("", ""));
    }

    private static List<Movie> getMovieListList() {
        return List.of(
                new Movie("101", "Harry Potter"),
                new Movie("102", "Tenet"),
                new Movie("103", "Gangs of Wasseypur"),
                new Movie("104", "Hera Pheri"),
                new Movie("105", "Interstellar"),
                new Movie("106", "Pulp Fiction"),
                new Movie("107", "Die Hard"),
                new Movie("108", "Udaan"),
                new Movie("109", "Ugly"),
                new Movie("110", "Dil Chahta Hai")
        );
    }
}
