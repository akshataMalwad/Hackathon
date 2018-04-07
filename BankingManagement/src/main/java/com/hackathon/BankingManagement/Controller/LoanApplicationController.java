package com.hackathon.BankingManagement.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.BankingManagement.Dao.ILoginDao;
import com.hackathon.BankingManagement.Pojo.Loan;
import com.hackathon.BankingManagement.Pojo.Register;
import com.hackathon.BankingManagement.Service.ILoanService;
import com.hackathon.BankingManagement.Service.ILoginService;

@CrossOrigin
@RestController
public class LoanApplicationController {
	
	@Autowired
	ILoanService service;
	
/*	@RequestMapping(value="/applyLoan", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Loan> applyLoan(@RequestBody Loan loanObj) {
		System.out.println("Inside LoanController....");
		System.out.println("tenure ="+loanObj.getTenure());
		System.out.println("aadhar Number ="+loanObj.getAadharNumber());
		System.out.println("loanAmount ="+loanObj.getLoanAmount());
		loanObj.setLoanStatus("Pending");
		return new ResponseEntity<>(loanObj, HttpStatus.CREATED);
	}
*/
	@RequestMapping(value="/applyLoan", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> applyLoan(@RequestBody Loan loanObj) {
		System.out.println("Inside LoanController....");
		Loan loan = service.insertLoan(loanObj);
		if(loan != null){
			return new ResponseEntity<>( HttpStatus.CREATED);
		}
		return new ResponseEntity<>("Loan application not accepted - Internal server issue.", HttpStatus.NOT_MODIFIED);
	}
	
	@RequestMapping(value="/regPendingApprovalList", method = RequestMethod.GET, produces = "application/json")
	public  ResponseEntity<List<Register>> pendingCustomerList()  {
		System.out.println("Inside Controller....");
		List<Register> pendingUserList=service.getRegisteredUserList();
		System.out.println("got the list");
				
		return new ResponseEntity<List<Register>>(pendingUserList, HttpStatus.OK);
	}

	@RequestMapping(value="/getLoanPendingApprovalList", method = RequestMethod.GET, produces = "application/json")
	public  ResponseEntity<List<Loan>> pendingLoanList()  {
		System.out.println("Inside Controller....");
		List<Loan> pendingLoanReqList=service.getPendgingLoanReqList();
		System.out.println("got the list");
				
		return new ResponseEntity<List<Loan>>(pendingLoanReqList, HttpStatus.OK);
		
	}

	@RequestMapping(value="/regApproval", method = RequestMethod.POST, consumes = "application/json")
	public  ResponseEntity<String> approveRegisterCustomer(@RequestBody Register regObj)  {
		System.out.println("Inside Controller....");
		int count =  service.approveRegisterCustomer(regObj);
		if(count > 0){
			return new ResponseEntity<>( HttpStatus.OK);
		}
		return new ResponseEntity<>("Approval Failed - Internal server issue.", HttpStatus.NOT_MODIFIED);
	}

	
	@RequestMapping(value="/loanApproval", method = RequestMethod.POST, consumes = "application/json")
	public  ResponseEntity<String> approveLoan(@RequestBody Register regObj)  {
		System.out.println("Inside Controller....");
		int count =  service.approveLoan(regObj);
		if(count > 0){
			return new ResponseEntity<>( HttpStatus.OK);
		}
		return new ResponseEntity<>("Approval Failed - Internal server issue.", HttpStatus.NOT_MODIFIED);
	}

}
