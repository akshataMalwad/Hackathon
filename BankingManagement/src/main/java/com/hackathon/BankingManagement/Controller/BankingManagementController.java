package com.hackathon.BankingManagement.Controller;

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
import com.hackathon.BankingManagement.Service.ILoginService;

@CrossOrigin
@RestController
public class BankingManagementController {
	
	@Autowired
	ILoginService service;
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> login(@RequestBody Register user) {
		System.out.println("Inside Controller....");
		Register result = service.getPersonByUserName(user.getUsername(), user.getPassword());
		System.out.println("\nUser data = "+user.toString());
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@RequestMapping(value="/register", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> registerCustomer(@RequestBody Register user) {
		System.out.println("Inside Controller....");
		user.setStatus("pending");
		user.setRole("customer");
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@RequestMapping(value="/login1", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> login1(@RequestBody Register newCourse) {
		System.out.println("Inside Controller....");
		
		Register user = service.getPersonByUserName(newCourse.getUsername(), newCourse.getPassword());
		System.out.println("\nUser data = "+user.toString());

		return new ResponseEntity<>(newCourse, HttpStatus.OK);
	}

	@RequestMapping(value="/register1", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Register> registerCustomer1(@RequestBody Register newCourse) {
		System.out.println("Inside Controller....");
		return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
	}
	
}
