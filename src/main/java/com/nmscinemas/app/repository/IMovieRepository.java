package com.nmscinemas.app.repository;

import java.util.List;

import com.nmscinemas.app.beans.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByMovieName(String movieName);
	List<Movie> findByMovieGenre(String movieGenre);
	List<Movie> findByMovieLanguage(String movieLanguage);
	List<Movie> findByMovieShowTime(String movieShowTime);
	
	

}
