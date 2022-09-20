package com.ibraWaKhait.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "Administrateurs")
@DiscriminatorValue(value = "ADMIN")
public class Administrateur extends Utilisateur{
	
	@Enumerated
	private ERole eRole;

}
