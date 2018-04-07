package com.hackathon.BankingManagement.Pojo;

public class Register {
	
	public int aadharNumber;
	public String username;
	public String fullName;
	public String email;
	public String status;
	public String role;
	public String password;
	public String contactNumber;
	
	public Register() {
		super();
	}
	
	public Register(int userId, String fullName, String username,  String email, String status, String role, String password,
			String contactNumber) {
		super();
		this.aadharNumber = userId;
		this.fullName = fullName;
		this.email = email;
		this.username = username;
		this.status = status;
		this.role = role;
		this.password = password;
		this.contactNumber = contactNumber;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

}
