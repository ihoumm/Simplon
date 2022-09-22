package com.ibraWaKhait.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

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
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "product_sku")
	private String product_sku;

	@NotBlank
	@Column(name = "Product_name")
	private String product_name;

	@NotBlank
	@Column(name = "description")
	private String description;

	@NotBlank
	@Column(name = "unit_price")
	private String unit_price;

	@NotBlank
	@Column(name = "image_url")
	private String image_url;

	@NotBlank
	@Column(name = "is_active")
	private Boolean is_active;

	@NotBlank
	@Column(name = "units_in_stock")
	private int units_in_stock;

	@NotBlank
	@Column(name = "inserted_at")
	@Temporal(value = TemporalType.DATE)
	@CreationTimestamp
	private Date inserted_at;

	@NotBlank
	@Column(name = "updated_at")
	@Temporal(value = TemporalType.DATE)
	@UpdateTimestamp
	private Date updated_at;

//	Category
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	
	// Invoice
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "product", cascade = CascadeType.ALL)
    private List<Invoice> invoices = new ArrayList();
	
	
	//Color
	@ManyToMany
	@JoinTable(name = "product_colors", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "color_id"))
	Set<Color> productColors;
	
	//Client
	@ManyToMany
	@JoinTable(name = "client_products", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "client_id"))
	Set<Color> clientProducts;
}
