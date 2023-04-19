package com.example.lab_spring_cinema.controllers;


import com.example.lab_spring_cinema.models.Movie;
import com.example.lab_spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")

public class MovieController {

    @Autowired
    MovieService movieService;


//    @GetMapping
//    public ResponseEntity<Movie> newMovie(){
//        Movie movie = new Movie(1, "ABC", "12A", 120);
//        return new ResponseEntity<>(movie, HttpStatus.OK);
//    }

    @PostMapping
    public ResponseEntity<Movie> newMovie(){
        Movie movie = movieService.newMovie();
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllGames(){
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        Optional<Movie> movies = movieService.getMovieById(id);
        if (movies.isPresent()){
            return new ResponseEntity<>(movies.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }













}
