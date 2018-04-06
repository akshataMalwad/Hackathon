package com.hackathon.BankingManagement.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.BankingManagement.Pojo.User;

@CrossOrigin
@RestController
public class BankingManagementController {
	
	@RequestMapping(value="/login", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<User> login(@RequestBody User newCourse) {
		System.out.println("Inside Controller....");
		return new ResponseEntity<>(newCourse, HttpStatus.OK);
	}

	@RequestMapping(value="/register", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<User> registerCustomer(@RequestBody User newCourse) {
		System.out.println("Inside Controller....");
		return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
	}
	
}
