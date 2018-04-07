package com.hackathon.BankingManagement.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hackathon.BankingManagement.Dao.ILoanDao;
import com.hackathon.BankingManagement.Dao.ILoginDao;
import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

public class LoanService implements ILoanService {

	
	@Autowired
	ILoanDao dao;
	
	@Override
	public Loan insertLoan(Map<String, String> loanDetailsJson) {
		try{
			Loan loan = dao.insertLoan(loanDetailsJson);
			return loan;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return null;
	}

	@Override
	public Loan getLoanByAadharId(String aadharId) {
		return null;
	}

}
