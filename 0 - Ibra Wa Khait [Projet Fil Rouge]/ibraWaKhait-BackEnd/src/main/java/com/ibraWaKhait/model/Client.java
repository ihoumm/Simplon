package com.ibraWaKhait.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
@DiscriminatorValue(value = "CLIENT")
public class Client extends User{
	
	@Enumerated(value = EnumType.STRING)
	private ERole eRole;
	
	@NotBlank
	@Email
	@Column(name = "email")
	private String email;
	
	@NotBlank
	@Column(name = "address")
	private String address;
	
	@NotBlank
	@Column(name = "country")
	private String country;
	
	@NotBlank
	@Column(name = "city")
	private String city;
	
	@NotBlank
	@Column(name = "zip_code")
	private String zipCode;
	
	@NotBlank
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotBlank
	@Column(name =  "account_status")
	private String accountStatus;
	
	
	// Product
	@ManyToMany(mappedBy = "clientProducts")
	private Set<Product> products = new HashSet<>();
}
