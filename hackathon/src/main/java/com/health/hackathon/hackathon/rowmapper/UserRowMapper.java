package com.health.hackathon.hackathon.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.health.hackathon.hackathon.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet res, int arg1) throws SQLException {
		User user = new User();
		user.setAadharNo(res.getString("AADHARNO"));
		user.setAddress(res.getString("ADDRESS"));
		user.setContactNo(res.getString("CONTACTNO"));
		user.setGender(res.getString("GENDER"));
		user.setName(res.getString("NAME"));
		user.setUserType(res.getInt("USERTYPE"));
		return user;
	}

}
