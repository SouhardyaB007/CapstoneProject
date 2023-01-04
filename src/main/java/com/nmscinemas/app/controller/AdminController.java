package com.nmscinemas.app.controller;

import java.util.List;

import com.nmscinemas.app.beans.Movie;
import com.nmscinemas.app.service.IMovieService;
import com.nmscinemas.app.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	IMovieService movieService;
	
	@Autowired
	IUserService service;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ModelAndView addMovie(Movie movie) {
		
		movieService.addMovie(movie);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView updateMovie(Movie movie) {
		
		movieService.updateMovie(movie);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public ModelAndView getAllMovie(){
		
		List<Movie> movieList = movieService.getAllMovie();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("movieList",movieList);
		mv.setViewName("AdminDashboard");
		return mv;
		
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.POST)
	public ModelAndView deleteMovie(@RequestParam("id") int movieId){
		
		movieService.deleteMovie(movieId);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value="/get/name/{name}",method = RequestMethod.GET)
	public List<Movie> searchMovie(@RequestParam("name") String movieName){
		
		return movieService.getMovieByName(movieName);
	}
	
	@RequestMapping("/logout")
	public ModelAndView logut(HttpSession session){
		
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Logout");
		return mv;
	}

}
