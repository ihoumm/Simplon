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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "invoices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invoice_id;
	
	@NotBlank
	@Column(name = "invoice_Date")
	@Temporal(value=TemporalType.DATE)
	private Date invoice_date;
	
	@NotBlank
	@Column(name = "invoice_Reference")
	private Date invoice_reference;
	
	@NotBlank
	@Column(name = "invoice_name")
	private String invoiceName;
	
	@NotBlank
	@Column(name = "Recieptient_fName")
	private String recieptient_fName;
	
	@NotBlank
	@Column(name = "Recieptient_lName")
	private String recieptient_lName;
	
	@NotBlank
	@Column(name = "Recieptient_Phone")
	private String recieptient_phone;
	
	@NotBlank
	@Column(name = "Recieptient_Address")
	private String recieptient_address;
	
	@NotBlank
	@Column(name = "Inserted_At")
	@Temporal(value=TemporalType.DATE)
	private Date inserted_at;
	
	@NotBlank
	@Column(name = "Updated_At")
	@Temporal(value=TemporalType.DATE)
	private Date updated_at;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
}
