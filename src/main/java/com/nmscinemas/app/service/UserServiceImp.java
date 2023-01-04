package com.nmscinemas.app.service;

import com.nmscinemas.app.beans.User;
import com.nmscinemas.app.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	IUserRepository repo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public boolean checkUser(String username, String password) {
		
		User user = repo.checkUserCredential(username, password);
		
		if(user==null) {
			return false;
		}
		return true;
		
	}

	@Override
	public User findUser(String username,String password) {
		
		return repo.checkUserCredential(username, password);
		
	}

}
