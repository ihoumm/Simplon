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
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@Column(name = "Coupon_Code")
	private Long coupon_Code;
	
	@Column(name = "Acitve")
	private Boolean active;
	
	@Column(name = "Start_Date")
	private Date start_Date;
	
	@Column(name = "End_Date")
	private Date end_Date;
	
	@Column(name = "Discount_Value")
	private String discount_Value;
	
	@Column(name = "Inserted_At")
	private Date inserted_at;
	
	@Column(name = "Updated_At")
	private Date updated_at;

	//Here mappedBy indicates that the owner is in the other side
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "coupons", cascade = CascadeType.ALL)
    private Set<Coupon> coupons = new HashSet<Coupon>();
}
