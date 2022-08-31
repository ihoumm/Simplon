package com.sousstalent.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "activite")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;

	@Column(name = "titre")
	private String titre;

	@Column(name = "descriptif")
	private String descpritif;

	@Column(name = "type")
	private String type;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;

	@Column(name = "etat")
	private String etat;

	@ManyToOne
	@JoinColumn(name = "id_exe")
	private Exercice exercice;

	@ManyToOne
	@JoinColumn(name = "id_user_res")
	@JsonIgnore
	private Responsable responsable;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "participants_activites") //, joinColumns = @JoinColumn(name = "id_participant"), inverseJoinColumns = @JoinColumn(name = "id_activite"))
	private List<Participant> participants;

}
