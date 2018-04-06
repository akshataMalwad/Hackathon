package com.hackathon.BankingManagement.Pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<Register>{

	@Override
	public Register mapRow(ResultSet rs, int arg1) throws SQLException {
		Register user = new Register();
		user.setContactNumber(rs.getString("contactNumber"));
		user.setFullName("fullname");
		user.setEmail("email");
		return user;
	}

	
}
