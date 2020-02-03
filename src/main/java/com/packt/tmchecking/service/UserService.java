package com.packt.tmchecking.service;

import java.util.List;

import com.packt.tmchecking.domain.User;

public interface UserService {
	
	public User findByUserName(String username);
	
	public void save(User user);
	
	public List<User> findAll();

}
