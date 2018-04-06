package com.hackathon.BankingManagement.Dao;

import java.util.List;

import com.hackathon.BankingManagement.Pojo.User;

public interface ILoginDao {

	User getPersonByUserName(String userName, final String password);


}
