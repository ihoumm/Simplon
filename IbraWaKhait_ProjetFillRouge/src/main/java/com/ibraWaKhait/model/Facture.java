package com.ibraWaKhait.model;

import java.util.Date;

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
@Table(name = "factures")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long facture_id;
	
	@Column(name = "facture_Date")
	private Date facture_date;
	
	@Column(name = "facture_Reference")
	private Date facture_reference;
	
	@Column(name = "Nom_de_facture")
	private String nom_de_facture;
	
	@Column(name = "Recieptient_fName")
	private String recieptient_fName;
	
	@Column(name = "Recieptient_lName")
	private String recieptient_lName;
	
	@Column(name = "Recieptient_Phone")
	private String recieptient_phone;
	
	@Column(name = "Recieptient_Address")
	private String recieptient_address;
	
	@Column(name = "Inserted_At")
	private Date inserted_at;
	
	@Column(name = "Updated_At")
	private Date updated_at;
}
