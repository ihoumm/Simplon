package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Coupon;

public interface CouponService {
	
	Coupon addCoupon(Coupon coupon);
	
	List<Coupon> getAllCoupons();
	
	Coupon getCouponById(long id);
	
	Coupon updateCoupon(Coupon coupon, long id);

	void deleteCouponById(long id);
}
