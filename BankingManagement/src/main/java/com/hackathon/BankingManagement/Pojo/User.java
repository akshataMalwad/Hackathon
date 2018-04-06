package com.hackathon.BankingManagement.Pojo;

public class User {
	
	public int userId;
	public String fullName;
	public String email;
	public String status;
	public String role;
	public String password;
	public String contactNumber;
	

	public User(int userId, String fullName, String email, String status, String role, String password,
			String contactNumber) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.status = status;
		this.role = role;
		this.password = password;
		this.contactNumber = contactNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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

	
	

}
