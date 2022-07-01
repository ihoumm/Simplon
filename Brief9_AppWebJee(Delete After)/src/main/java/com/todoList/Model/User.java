package com.todoList.Model;

public class User {
	private int userId;
	private String first_name, last_name, username, password;
	public User() {
		super();
	}
	
	public User( String first_name, String last_name, String username, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
	}
	
	public User(int userId, String first_name, String last_name, String username, String password) {
		super();
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
	}
	public User(Object setString, Object setString2, Object setString3, Object setString4) {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
				+ username + ", password=" + password + "]";
	}
	
}
