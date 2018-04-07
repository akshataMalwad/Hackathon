package com.hackathon.BankingManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.hackathon.BankingManagement.Dao.ILoginDao;
import com.hackathon.BankingManagement.Pojo.Register;

@Service
public class LoginService implements ILoginService {

	@Autowired
	ILoginDao dao;
	
	@Override
	public Register getPersonByUserName(String userName, String password) {
		try{
			Register user = dao.getPersonByUserName(userName, password);
			return user;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return null;
	}
	
	@Override
	public int registerUser(Register register) {
		// TODO Auto-generated method stub
		int result=0;
		try{
			 result = dao.registerUser(register);
			return result;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return result;
		
	}



}
