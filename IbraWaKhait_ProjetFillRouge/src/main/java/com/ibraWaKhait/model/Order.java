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
	
	@Column(name = "Order_Date")
	private Date order_Date;
	
	@Column(name = "Quantite")
	private int quantity;
	
	@Column(name = "Inserted_At")
	private Date inserted_at;
	
	@Column(name = "Updated_At")
	private Date updated_at;
	
	
	
	@ManyToOne
    @JoinColumn(name = "client_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "product_id")
   private  Product product;
	
	
}
