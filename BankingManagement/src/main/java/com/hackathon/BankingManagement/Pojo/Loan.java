package com.hackathon.BankingManagement.Pojo;

public class Loan {

	public int loanId;
	public String aadharNumber;
	public String loanStatus;
	public float loanamount;
	public int tenure;
	
	
	public Loan() {
		super();
	}

	public Loan(int loanId, String aadharNumber,String status,  float loanamount, int tenure) {
		super();
		this.loanId = loanId;
		this.aadharNumber = aadharNumber;
		this.loanStatus = status;
		this.loanamount = loanamount;
		this.tenure = tenure;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String adharNumber) {
		this.aadharNumber = adharNumber;
	}
	public float getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(float loanamount) {
		this.loanamount = loanamount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	
	
}
