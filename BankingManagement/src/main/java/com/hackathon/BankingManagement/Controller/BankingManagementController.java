package com.hackathon.BankingManagement.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.BankingManagement.Pojo.User;

@RestController
public class BankingManagementController {
	
	@PostMapping("/login")
	public ResponseEntity<Void> login(@RequestBody User newCourse) {

		if (true){
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.noContent().build();
	}

	
}
