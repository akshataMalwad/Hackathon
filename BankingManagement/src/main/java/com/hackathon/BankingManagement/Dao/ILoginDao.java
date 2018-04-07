package com.hackathon.BankingManagement.Dao;

import java.util.List;

import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoginDao {

	Register getPersonByUserName(String userName, final String password);

	public int registerUser(Register register);

}
