package com.ibraWaKhait.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long review_id;
	
	@Column(name = "Stars")
	private String stars;
	
	@Column(name = "Titre")
	private String tite;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "Body")
	private String body;
	
	@Column(name = "Inserted_At")
	private Date inserted_at;
	
	@Column(name = "Updated_At")
	private Date updated_at;
	
	@OneToMany(mappedBy = "products")
    Set<Product> products;
	
}
