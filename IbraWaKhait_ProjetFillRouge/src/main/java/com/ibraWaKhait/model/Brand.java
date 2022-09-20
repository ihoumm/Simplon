package com.ibraWaKhait.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long brand_id;
	
	@Column(name = "Brand_Name")
	private String brand_name;
	
	@Column(name = "Slogan")
	private String slogan;
	
	@Column(name = "Logo")
	private String logo;
	
	@Column(name = "Inserted_At")
	private Date inserted_at;
	
	@Column(name = "Updated_At")
	private Date updated_at;
	
}
