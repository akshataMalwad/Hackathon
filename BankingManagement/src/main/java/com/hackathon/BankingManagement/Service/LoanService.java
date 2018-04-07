package com.hackathon.BankingManagement.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.hackathon.BankingManagement.Dao.ILoanDao;
import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

@Service
public class LoanService implements ILoanService {

	
	@Autowired
	ILoanDao dao;
	
	@Override
	public Loan insertLoan(Loan loanDetailsJson) {
		try{
			Loan loan = dao.insertLoan(loanDetailsJson);
			if(loan != null)
				return loan;
			else 
				return null;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return null;
	}

	@Override
	public Loan getLoanByAadharId(String aadharId) {
		try{
			Loan user = dao.getLoanByAadharId(aadharId);
			return user;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return null;
	}
	
	@Override
	public List<Register> getRegisteredUserList() {
		// TODO Auto-generated method stub
		List<Register> pendingUserList=dao.getRegisteredUserList();
		System.out.println("returning from service");
		return pendingUserList;
	}


	@Override
	public List<Loan> getPendgingLoanReqList() {
		// TODO Auto-generated method stub
		List<Loan> pendingLoanReqList=dao.getPendingLoanList();
		System.out.println("returning from service");
		return pendingLoanReqList;
	}

	@Override
	public int approveRegisterCustomer(Register regObj) {
		try{
			int count = dao.updateRegitserStatus(regObj);
			if(count > 0)
				return count;
			else 
				return 0;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return 0;
	}

	@Override
	public int approveLoan(Register regObj) {
		try{
			int count = dao.updateLoanStatus(regObj);
			if(count > 0)
				return count;
			else 
				return 0;
		} catch (DataAccessException ex) {
			System.out.println("Error ="+ex.toString());	
		}
		return 0;
	}


}
