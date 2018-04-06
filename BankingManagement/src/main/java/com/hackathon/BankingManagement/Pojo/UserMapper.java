package com.hackathon.BankingManagement.Pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setContactNumber(rs.getString("contactNumber"));
		user.setFullName("fullname");
		user.setEmail("email");
		return user;
	}

	
}
