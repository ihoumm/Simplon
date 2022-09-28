package com.ibraWaKhait.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private String price;
	
	private String imageUrl;
	
	private String unitsInStock;
	
	@Temporal(value = TemporalType.DATE)
	@CreationTimestamp
	private Date inserted_at;
	
	@Temporal(value = TemporalType.DATE)
	@UpdateTimestamp
	private Date updated_at;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;

}
