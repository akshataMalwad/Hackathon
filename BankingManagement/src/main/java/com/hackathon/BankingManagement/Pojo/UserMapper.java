package com.hackathon.BankingManagement.Pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<Register>{

	@Override
	public Register mapRow(ResultSet rs, int arg1) throws SQLException {
		Register user = new Register();
		user.setContactNumber(rs.getString("contactNumber"));
		user.setFullName(rs.getString("fullName"));
		user.setEmail(rs.getString("email"));
		//user.setPassword(rs.getString("pass"));
		user.setRole(rs.getString("role"));
		user.setRegistrationStatus(rs.getString("registrationStatus"));
		user.setAadharNumber(rs.getString("aadharNumber"));
		user.setUserName(rs.getString("userName"));
		return user;
	}

	
}
