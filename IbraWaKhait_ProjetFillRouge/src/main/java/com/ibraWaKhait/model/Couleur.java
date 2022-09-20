package com.ibraWaKhait.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Couleurs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Couleur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long couleur_Id;
	
	@Column(name = "Nom_de_Couleur")
	private String nom_de_couleur;
}
