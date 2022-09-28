package com.ibraWaKhait.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {
	
	private String email;
	
	private String address;
	
	private String country;
	
	private String city;
	
	private String zipCode;
	
	private String phoneNumber;
	

}
