package com.example.lab_spring_cinema.services;

import com.example.lab_spring_cinema.models.Movie;
import com.example.lab_spring_cinema.repositories.MovieList;
import com.example.lab_spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;



    public MovieService(){


    }

    @GetMapping
    public Movie newMovie(){
        Movie movie = new Movie(1, "Iron Man", "12A", 120);
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);
    }



//    GETTERS & SETTERS


}
