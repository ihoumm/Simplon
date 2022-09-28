package com.ibraWaKhait.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "deliveryMethods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DeliveryMethod_id;
	
	@NotBlank
	@Column(name = "DeliveryMethod_name")
	private String DeliveryMethodName;
	
	@NotBlank
	@Column(name = "Shipped_At")
	@Temporal(value=TemporalType.DATE)
	private Date shipped_at;
	
	@NotBlank
	@Column(name = "Recieved_At")
	@Temporal(value=TemporalType.DATE)
	private Date recieved_at;
}
