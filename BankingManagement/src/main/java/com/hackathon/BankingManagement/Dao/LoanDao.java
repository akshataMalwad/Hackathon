package com.hackathon.BankingManagement.Dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.LoanMapper;
import com.hackathon.BankingManagement.Pojo.Register;
import com.hackathon.BankingManagement.Pojo.UserMapper;

@Component
public class LoanDao implements ILoanDao{


	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_LOAN = "select * from loan where aadharNumber = ?";
	private final String SQL_INSERT_LOAN = "INSERT into loan("+"aadharNumber,"+"tenure,"+"loanAmount,"+"loanStatus) "+"values(?,?,?,?)";
	private final String SQL_GET_REGISTER_USERLIST = "select * from register where registrationStatus='pending'";
	
	@Autowired
	public LoanDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Loan getLoanByAadharId(String aadharId) {
		return jdbcTemplate.queryForObject(SQL_FIND_LOAN, new Object[] { aadharId }, new LoanMapper());

	}

	@Override
	public Loan insertLoan(Loan loanDetailsJson) {
		loanDetailsJson.setLoanStatus("pending");
		System.out.println("data ="+loanDetailsJson.toString());
		 int count = jdbcTemplate.update(SQL_INSERT_LOAN, new Object[] {
				    		loanDetailsJson.getTenure(), loanDetailsJson.getLoanAmount(),loanDetailsJson.getAadharNumber(), loanDetailsJson.getLoanStatus()});
		 if(count > 0 ){
			 return loanDetailsJson;
		 }
		 return null;
	}
	
	@Override
	public List<Register> getRegisteredUserList() {
		List<Register> registeredUserList = jdbcTemplate.query(SQL_GET_REGISTER_USERLIST, 
                new UserMapper());            
		
		
		return registeredUserList;
	}
	
}
