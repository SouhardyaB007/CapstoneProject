package com.nmscinemas.app.beans;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="movie_table")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	
	private String movieName;
	private String movieGenre;
	private String movieLanguage;
	private String movieShowTime;
	private String moviePrice;
	private LocalDate movieReleaseDate;
	private String movieDescription;
	private String movieImageUrl;
	
	private boolean isEnabled;

}
