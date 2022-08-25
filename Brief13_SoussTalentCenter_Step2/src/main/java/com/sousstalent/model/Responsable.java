package com.sousstalent.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "responsable")
@DiscriminatorValue("Responsable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Responsable extends Users{
	
	@Column(name = "domaine")
	private String domaine;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "etat")
	private String etat;
	
	@OneToMany(mappedBy = "responsable")
//	@JsonIgnore
	private List<Activite> activite;
}
