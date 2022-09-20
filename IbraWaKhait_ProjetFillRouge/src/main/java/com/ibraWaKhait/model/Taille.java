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
@Table(name = "Tailles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taille {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taille_id;
	
	@Column(name = "Taille")
	private String  taille;
}
