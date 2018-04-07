package com.hackathon.BankingManagement.Service;

import java.util.Map;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoanService {

	public Loan insertLoan(Map<String, String> loanDetailsJson);
	
	public Loan getLoanByAadharId(String aadharId);

}
