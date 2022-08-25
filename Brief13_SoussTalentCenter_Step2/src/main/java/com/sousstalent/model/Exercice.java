package com.sousstalent.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "exercice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	
	@Column(name = "annee")
	private int annee;
	
	@Column(name = "date_debut")
	private Date date_debut;
	
	@Column(name = "date_fin")
	private Date date_fin;
	
	@Column(name = "statut")
	private String statut;
	
	@OneToMany(mappedBy = "exercice")
	@JsonIgnore
	private List<Activite> activite;
	

}
