package com.hackathon.BankingManagement.Service;

import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoginService {

	public Register getPersonByUserName(String userName, final String password);
	
	public int registerUser(Register register);

}
