package com.hackathon.BankingManagement.Pojo;

public class Register {
	
	public String aadharNumber;
	public String userName;
	public String fullName;
	public String email;
	public String registrationStatus;
	public String role;
	public String password;
	public String contactNumber;
	
	public Register() {
		super();
	}
	
	public Register(String userId, String fullName, String username,  String email, String status, String role, String password,
			String contactNumber) {
		super();
		this.aadharNumber = userId;
		this.fullName = fullName;
		this.email = email;
		this.userName = username;
		this.registrationStatus = status;
		this.role = role;
		this.password = password;
		this.contactNumber = contactNumber;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
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
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
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
	

}
