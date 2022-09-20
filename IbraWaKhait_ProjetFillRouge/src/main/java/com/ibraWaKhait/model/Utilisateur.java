package com.ibraWaKhait.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utilisateurs")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long utilisateur_id;
	
	@Column(name = "Nom")
	private String nom;
	
	@Column(name = "Prenom")
	private String prenom;
	
	@Column(name = "Username")
	private String username;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Pays")
	private String pays;
	
	@Column(name = "Ville")
	private String ville;
	
	@Column(name = "Code_Postal")
	private String CodePostal;
	
	@Column(name = "Telephone")
	private String telephone;
	
	@OneToMany(mappedBy = "utilisateurs")
    Set<Utilisateur> utilisateurs;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

}
