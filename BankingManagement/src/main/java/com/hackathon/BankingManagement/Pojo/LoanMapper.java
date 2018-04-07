package com.hackathon.BankingManagement.Pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoanMapper implements RowMapper<Loan>{

	@Override
	public Loan mapRow(ResultSet rs, int arg1) throws SQLException {
		Loan loan = new Loan();
		loan.setAadharNumber(rs.getString("aadharNumber"));		
		loan.setLoanStatus(rs.getString("loanStatus"));		
		loan.setLoanamount(rs.getFloat("loanAmount"));
		loan.setTenure(rs.getInt("tenure"));
		loan.setLoanId(rs.getInt("loanId"));
		return loan;
	}
	
}
