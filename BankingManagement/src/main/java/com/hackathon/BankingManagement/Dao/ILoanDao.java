package com.hackathon.BankingManagement.Dao;

import java.util.List;
import java.util.Map;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoanDao {

	public Loan getLoanByAadharId(String aadharId);
	
	public Loan insertLoan(Loan loanDetailsJson);
	
	public List<Register> getRegisteredUserList();


}
