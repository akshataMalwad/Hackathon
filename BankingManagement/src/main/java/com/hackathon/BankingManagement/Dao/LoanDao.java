package com.hackathon.BankingManagement.Dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.LoanMapper;

public class LoanDao implements ILoanDao{


	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_LOAN = "select * from loan where aadharNumber = ?";

	@Autowired
	public LoanDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Loan getLoanByAadharId(String aadharId) {
		return jdbcTemplate.queryForObject(SQL_FIND_LOAN, new Object[] { aadharId }, new LoanMapper());

	}

	@Override
	public Loan insertLoan(Map<String, String> loanDetailsJson) {
		
		 int count = jdbcTemplate.update(
				    "INSERT INTO loan(loanId,tenure, loanAmount, aadharNumber)VALUES(?,?,?,?)", new Object[] {
				    		loanDetailsJson.get("loanId"), loanDetailsJson.get("tenure"), loanDetailsJson.get("loanAmount"),loanDetailsJson.get("aadharNumber") });
		 return null;
	}
	
}
