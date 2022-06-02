package com.managestds.dao;

public class Student {
	private int stdId;
	private String fName, lName, email, address, city, country, created_at, updated_at;
	public int getUserId() {
		return stdId;
	}
	public void setUserId(int userId) {
		this.stdId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public Student(int userId, String fName, String lName, String email, String address, String city, String country,
			String created_at, String updated_at) {
		this.stdId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Student( String email, String fName, String lName, String address, String city, String country) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Students userId = " + stdId + ", fName = " + fName + ", lName = " + lName + ", email = " + email
				+ ", address = " + address + ", city = " + city + ", country = " + country + ", created_at = " + created_at
				+ ", updated_at = " + updated_at;
	}
	
	
}