package com.hackathon.BankingManagement.Service;

import java.util.List;
import java.util.Map;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;

public interface ILoanService {

	public Loan insertLoan(Loan loanDetailsJson);
	
	public Loan getLoanByAadharId(String aadharId);
	
	public List<Register> getRegisteredUserList();
	
	public List<Loan> getPendgingLoanReqList();

	public int approveRegisterCustomer(Register regObj);

	public int approveLoan(Register regObj);


}
