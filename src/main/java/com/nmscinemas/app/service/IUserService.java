package com.nmscinemas.app.service;

import com.nmscinemas.app.beans.User;

public interface IUserService {
	
	public User addUser(User user);
	public boolean checkUser(String username,String password);
	public User findUser(String username,String password);

}
