package com.ibraWaKhait.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@DiscriminatorValue(value = "CLIENT")
public class Client extends Utilisateur{
	
	@Enumerated(value = EnumType.STRING)
	private ERole eRole;
	
	@Column(name =  "status")
	private String status;
	
//	@OneToMany(mappedBy = "products")
//    Set<Product> products;

}
