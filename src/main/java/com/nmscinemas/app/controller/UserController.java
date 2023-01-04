package com.nmscinemas.app.controller;

import java.util.List;

import com.nmscinemas.app.beans.Cart;
import com.nmscinemas.app.beans.Movie;
import com.nmscinemas.app.service.ICartService;
import com.nmscinemas.app.service.IMovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	ICartService cartService;
	
	@Autowired
	IMovieService movieService;
	
	@RequestMapping(value="/add/{movieId}/{uid}",method = RequestMethod.POST)
	public ModelAndView addTOCart(HttpServletRequest request) {
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		Cart cart = new Cart();
		
		Movie movie = movieService.getMovieById(movieId);
		
		cart.setUid(uid);
		cart.setMovieId(movie.getMovieId());
		cart.setMovieName(movie.getMovieName());
		cart.setMovieLanguage(movie.getMovieLanguage());
		cart.setMovieGenre(movie.getMovieGenre());
		cart.setMoviePrice(movie.getMoviePrice());
		cart.setMovieDescription(movie.getMovieDescription());
		cart.setMovieReleaseDate(movie.getMovieReleaseDate());
		cart.setMovieShowTime(movie.getMovieShowTime());
		cart.setMovieImageUrl(movie.getMovieImageUrl());
		
		 cartService.addToCart(cart);
		 
		 return new ModelAndView("redirect:/user/get/cart/{uid}");
		
		
	}
	
	@RequestMapping(value="/delete/{cartId}",method = RequestMethod.POST)
	public ModelAndView deleteFromCart(HttpServletRequest request) {
		
		int cartId = Integer.parseInt(request.getParameter("cartId"));
		
		cartService.deleteFromCart(cartId);
		
		return new ModelAndView("redirect:/user/get/cart/{uid}");
	}
	
	@RequestMapping(value="/get/cart/{uid}")
	public ModelAndView viewCart(HttpServletRequest request){
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		List<Cart> cartList = cartService.getByUid(uid);
		
        ModelAndView mv = new ModelAndView();
		
		mv.addObject("cartList",cartList);
		mv.setViewName("ViewCart");
		return mv;
		
	
	}
	@RequestMapping("/logout")
	public ModelAndView logut(HttpSession session){
		
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Logout");
		return mv;
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public ModelAndView getAllMovie(){
		
		List<Movie> movieList = movieService.getAllMovie();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("movieList",movieList);
		mv.setViewName("UserDashboard");
		return mv;
		
	}
	
	
	

}
