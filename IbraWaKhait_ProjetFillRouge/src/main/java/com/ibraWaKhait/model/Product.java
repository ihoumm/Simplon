package com.ibraWaKhait.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	private Long product_id;
	
	@Column(name = "product_sku")
	private String product_sku;
	
	@Column(name = "Product_name")
	private String Product_name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private String unit_price;
	
	@Column(name = "image_url")
	private String image_url;
	
	@Column(name = "is_active")
	private Boolean is_active;
	
	@Column(name = "units_in_stock")
	private int units_in_stock;
	
	@Column(name = "inserted_at")
	@CreationTimestamp
	private Date inserted_at;
	
	@Column(name = "updated_at")
	@UpdateTimestamp
	private Date updated_at;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coupon_id", nullable = false)
	private Coupon coupon;
	
	@OneToMany(mappedBy = "products")
    Set<Product> products;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "review_id", nullable = false)
	private Review review;
	

}
