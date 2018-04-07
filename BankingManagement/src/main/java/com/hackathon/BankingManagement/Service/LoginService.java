package com.hackathon.BankingManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.BankingManagement.Dao.ILoginDao;
import com.hackathon.BankingManagement.Pojo.Register;

@Service
public class LoginService implements ILoginService {

	@Autowired
	ILoginDao dao;
	
	@Override
	public Register getPersonByUserName(String userName, String password) {
		Register user = dao.getPersonByUserName(userName, password);
		return user;
	}

}
