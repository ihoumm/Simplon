package com.ibraWaKhait.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	
	@NotBlank
	@Column(name = "Order_Date")
	private Date order_Date;
	
	@NotBlank
	@Column(name = "Quantite")
	private int quantity;
	
	@NotBlank
	@Column(name = "Inserted_At")
	@Temporal(value=TemporalType.DATE)
	private Date inserted_at;
	
	@NotBlank
	@Column(name = "Updated_At")
	@Temporal(value=TemporalType.DATE)
	private Date updated_at;
	
	//Client
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	//Product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private  Product product;
}
