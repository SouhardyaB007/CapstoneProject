package com.nmscinemas.app.repository;

import java.util.List;

import com.nmscinemas.app.beans.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
	
	List<Cart> findByUid(int uid);

}
