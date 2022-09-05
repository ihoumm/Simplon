package com.sousstalent.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "participant")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Participant extends Utilisateur {

	@Column(name = "domaine")
	private String domaine;

	@Column(name = "structure")
	private String structure;

	@ManyToMany(mappedBy = "participants", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Activite> activites;
}