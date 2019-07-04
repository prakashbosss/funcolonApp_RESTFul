package com.funcolon.model;

public class User {

	private int id;
	private String userName;
	private String userPwd;	
	private String userRole;
	
	public int getId() {
		return id;
	}
	public User(int id, String userName, String userPwd, String userRole) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userRole = userRole;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	
}
