package com.health.hackathon.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.hackathon.hackathon.dao.UserDao;
import com.health.hackathon.hackathon.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User addNewUser(User user){
		return userDao.addNewUser(user);
	}
	
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}
}
