package com.hackathon.BankingManagement.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.BankingManagement.Dao.ILoginDao;
import com.hackathon.BankingManagement.Pojo.Register;
import com.hackathon.BankingManagement.Service.ILoanService;
import com.hackathon.BankingManagement.Service.ILoginService;

@CrossOrigin
@RestController
public class LoanApplicationController {
	
/*	@Autowired
	ILoanService service;
	
	
	@RequestMapping(value="/applyLoan", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> applyLoan(Map<String, String> loanDetailsJson) {
		System.out.println("Inside LoanController....");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value="/applyLoan1", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> applyLoan1(@RequestBody Map<String, String> jsonData) {
		System.out.println("Inside LoanController....");
		//service.insertLoan(loanDetailsJson);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
*/
	
}
