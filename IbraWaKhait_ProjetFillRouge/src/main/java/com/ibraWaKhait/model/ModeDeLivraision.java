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
@Table(name = "ModeDeLivraisions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeDeLivraision {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ModeDeLivraision_Id;
	
	@Column(name = "Mode_de_Livraisn")
	private String modeDeLivraision;
	
	@Column(name = "Shipped_At")
	private Date shipped_at;
	
	@Column(name = "Recieved_At")
	private Date recieved_at;
//	
}
