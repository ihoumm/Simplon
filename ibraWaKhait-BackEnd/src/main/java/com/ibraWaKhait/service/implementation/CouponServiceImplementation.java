package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Coupon;
import com.ibraWaKhait.repository.CouponRepository;
import com.ibraWaKhait.service.CouponService;

public class CouponServiceImplementation implements CouponService {
	
	private CouponRepository couponRepository;

	@Override
	public Coupon addCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return this.couponRepository.save(coupon);
	}

	@Override
	public List<Coupon> getAllCoupons() {
		// TODO Auto-generated method stub
		return couponRepository.findAll();
	}

	@Override
	public Coupon getCouponById(long id) {
		// TODO Auto-generated method stub
		return this.couponRepository.findById(id).get();
	}

	@Override
	public Coupon updateCoupon(Coupon coupon, long id) {
		
		Coupon exestingCoupon = couponRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("couponRepository", "id", id));
		
		exestingCoupon.setCoupon_id(coupon.getCoupon_id());
		exestingCoupon.setCoupon_Code(coupon.getCoupon_Code());
		exestingCoupon.setISactive(coupon.getISactive());
		exestingCoupon.setStart_Date(coupon.getStart_Date());
		exestingCoupon.setEnd_Date(coupon.getEnd_Date());
		exestingCoupon.setDiscount_Value(coupon.getDiscount_Value());
		exestingCoupon.setInserted_at(coupon.getInserted_at());
		exestingCoupon.setUpdated_at(coupon.getUpdated_at());
		
		couponRepository.save(exestingCoupon);

		return exestingCoupon;
	}

	@Override
	public void deleteCouponById(long id) {
		this.couponRepository.deleteById(id);
		
	}

}
