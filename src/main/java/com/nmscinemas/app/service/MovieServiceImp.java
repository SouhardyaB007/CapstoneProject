package com.nmscinemas.app.service;

import java.util.List;

import com.nmscinemas.app.beans.Movie;
import com.nmscinemas.app.repository.IMovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImp implements IMovieService {
	
	@Autowired
	IMovieRepository repo;

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public ResponseEntity<String> deleteMovie(int movieId) {
		
		repo.deleteById(movieId);
		return new ResponseEntity<String>("Deleted movie!",HttpStatus.OK);
	}

	@Override
	public List<Movie> getMovieByName(String movieName) {
		// TODO Auto-generated method stub
		return repo.findByMovieName(movieName);
	}

	@Override
	public List<Movie> getMovieByLanguage(String movieLanguage) {
		// TODO Auto-generated method stub
		return repo.findByMovieLanguage(movieLanguage);
	}

	@Override
	public List<Movie> getMovieByGenre(String movieGenre) {
		// TODO Auto-generated method stub
		return repo.findByMovieGenre(movieGenre);
	}

	@Override
	public List<Movie> getMovieByTime(String movieShowTime) {
		// TODO Auto-generated method stub
		return repo.findByMovieShowTime(movieShowTime);
	}

	@Override
	public Movie getMovieById(int movieId) {
		// TODO Auto-generated method stub
		return repo.findById(movieId).orElse(null);
	}

}
