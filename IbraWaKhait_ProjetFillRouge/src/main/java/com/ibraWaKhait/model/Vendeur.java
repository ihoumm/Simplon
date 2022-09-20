package com.ibraWaKhait.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Vendeurs")
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue(value = "SELLER")
public class Vendeur extends Utilisateur {
	
	@Enumerated(value = EnumType.STRING)
	private ERole eRole;
	
	@Column(name =  "account_status")
	private String account_status;
	
}
