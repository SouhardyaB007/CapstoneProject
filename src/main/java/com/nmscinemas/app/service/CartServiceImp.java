package com.nmscinemas.app.service;

import java.util.List;

import com.nmscinemas.app.beans.Cart;
import com.nmscinemas.app.repository.ICartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImp implements ICartService {
	
	@Autowired
	ICartRepository repo;

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return repo.save(cart);
	}

	@Override
	public void deleteFromCart(int cartId) {
		
		repo.deleteById(cartId);

	}

	@Override
	public List<Cart> getByUid(int uid) {
		// TODO Auto-generated method stub
		return repo.findByUid(uid);
	}

}
