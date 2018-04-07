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
	
	private final String SQL_FIND_USER = "select * from register where userName = ? and pass = ?";
	private final String SQL_REGISTER_USER = "INSERT into register("+"aadharNumber,"+"userName,"+"fullName,"+"email,"+"registrationStatus,"+"role,"+"pass,"+"contactNumber) "+"values(?,?,?,?,?,?,?,?)";

	@Autowired
	public LoginDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Register getPersonByUserName(String userName, final String password) {
		return jdbcTemplate.queryForObject(SQL_FIND_USER, new Object[] { userName, password }, new UserMapper());
	}

	@Override
	public int registerUser(Register register) {
		// TODO Auto-generated method stub
		register.setRole("customer");
		register.setRegistrationStatus("pending");
		
		return jdbcTemplate.update(SQL_REGISTER_USER, new Object[] { register.getAadharNumber(), register.getUserName(),register.getFullName(),register.getEmail(),register.getRegistrationStatus(),register.getRole(),register.getPassword(),register.getContactNumber()});
		
		 
	}


	
}