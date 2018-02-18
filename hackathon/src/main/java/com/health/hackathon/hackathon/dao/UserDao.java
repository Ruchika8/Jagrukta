package com.health.hackathon.hackathon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.health.hackathon.hackathon.model.User;
import com.health.hackathon.hackathon.rowmapper.UserRowMapper;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String ADD_NEW_USER = "INSERT INTO USER(NAME, AADHARNO, ADDRESS, AGE, GENDER, USERTYPE, CONTACTNO) VALUES(?, ?, ?, ?, ?, ?, ?);";
	private final String GET_ALL_USER = "SELECT NAME, AADHARNO, ADDRESS, AGE, GENDER, USERTYPE, CONTACTNO FROM USER;";
	
	
	public User addNewUser(User user){
		jdbcTemplate.update(ADD_NEW_USER, user.getName(), user.getAadharNo(), user.getAddress(), user.getAge(), user.getGender(), user.getUserType(), user.getContactNo());
		return user;
	}
	
	public List<User> getAllUser(){
		return jdbcTemplate.query(GET_ALL_USER, new UserRowMapper());
	}
}
