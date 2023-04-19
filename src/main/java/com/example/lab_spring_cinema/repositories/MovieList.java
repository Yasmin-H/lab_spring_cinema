package com.example.lab_spring_cinema.repositories;


import com.example.lab_spring_cinema.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MovieList {

    private ArrayList<Movie> movies;

    public MovieList(){
        this.movies = new ArrayList<>();

    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public Movie getMovieById(int id){
        return this.movies.get(id -1);
    }

//    GETTERS & SETTERS

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
