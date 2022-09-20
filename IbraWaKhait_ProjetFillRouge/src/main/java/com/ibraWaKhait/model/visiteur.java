package com.ibraWaKhait.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "visitors")
@DiscriminatorValue(value = "VISITOR")
public class visiteur extends Utilisateur {
	
	@Enumerated(value = EnumType.STRING)
	private ERole eRole;
	
}
