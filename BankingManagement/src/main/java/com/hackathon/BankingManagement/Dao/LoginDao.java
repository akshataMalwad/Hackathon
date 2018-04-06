package com.hackathon.BankingManagement.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hackathon.BankingManagement.Pojo.Register;
import com.hackathon.BankingManagement.Pojo.UserMapper;

@Component
public class LoginDao implements ILoginDao{

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_USER = "select * from user where userName = ? and password = ?";

	@Autowired
	public LoginDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Register getPersonByUserName(String userName, final String password) {
		return jdbcTemplate.queryForObject(SQL_FIND_USER, new Object[] { userName, password }, new UserMapper());
	}

	
}