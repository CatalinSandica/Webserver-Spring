package com.sandica.entity;

public class User {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	public User(String firstname2, String lastname2, String username2, String password2) {
		this.firstname = firstname2;
		this.lastname = lastname2;
		this.username = username2;
		this.password = password2;
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return username;
	}
	public void setUserNme(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
