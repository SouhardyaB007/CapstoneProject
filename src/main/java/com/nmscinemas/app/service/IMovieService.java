package com.nmscinemas.app.service;

import java.util.List;

import com.nmscinemas.app.beans.Movie;

import org.springframework.http.ResponseEntity;

public interface IMovieService {

	public Movie addMovie(Movie movie);
	public Movie updateMovie(Movie movie);
	public List<Movie> getAllMovie();
	public ResponseEntity<String> deleteMovie(int movieId);
	public Movie getMovieById(int movieId);
	
	public List<Movie> getMovieByName(String movieName);
	public List<Movie> getMovieByLanguage(String movieLanguage);
	public List<Movie> getMovieByGenre(String movieGenre);
	public List<Movie> getMovieByTime(String movieShowTime);
	
	

}
