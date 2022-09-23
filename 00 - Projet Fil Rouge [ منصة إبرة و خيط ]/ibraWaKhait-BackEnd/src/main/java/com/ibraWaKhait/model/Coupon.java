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
@Table(name = "coupons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long coupon_id;
	
	@NotBlank
	@Column(name = "Coupon_Code")
	private Long coupon_Code;
	
	@NotBlank
	@Column(name = "Acitve")
	private Boolean iSactive;
	
	@NotBlank
	@Column(name = "Start_Date")
	@Temporal(value=TemporalType.DATE)
	private Date start_Date;
	
	@NotBlank
	@Column(name = "End_Date")
	@Temporal(value=TemporalType.DATE)
	private Date end_Date;
	
	@NotBlank
	@Column(name = "Discount_Value")
	private String discount_Value;
	
	@NotBlank
	@Column(name = "Inserted_At")
	@Temporal(value=TemporalType.DATE)
	private Date inserted_at;
	
	@NotBlank
	@Column(name = "Updated_At")
	@Temporal(value=TemporalType.DATE)
	private Date updated_at;
}
