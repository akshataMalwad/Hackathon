package com.hackathon.BankingManagement.Dao;

import java.util.Map;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoanDao {

	Loan getLoanByAadharId(String aadharId);
	
	public Loan insertLoan(Map<String, String> loanDetailsJson);


}
