package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Coupon;
import com.ibraWaKhait.service.CouponService;

public class CouponController {

	private CouponService couponService;

	public CouponController(CouponService couponService) {
		super();
		this.couponService = couponService;
	}

	// build create Coupon REST API
	@PostMapping
	public ResponseEntity<Coupon> save(@RequestBody Coupon coupon) {
		return new ResponseEntity<Coupon>(couponService.addCoupon(coupon), HttpStatus.CREATED);
	}

	// build get all Coupon REST API
	@GetMapping
	public List<Coupon> getAllCoupons() {
		return couponService.getAllCoupons();
	}

	// build get Coupon by id REST API
	// http://localhost:8080/api/coupon/1
	@GetMapping("{id}")
	public ResponseEntity<Coupon> getCouponById(@PathVariable("id") long coupon_id) {
		return new ResponseEntity<Coupon>(couponService.getCouponById(coupon_id), HttpStatus.OK);
	}

	// build update Coupon REST API
	// http://localhost:8080/api/coupon/1
	@PutMapping("{id}")
	public ResponseEntity<Coupon> updateCoupon(@PathVariable("id") long id, @RequestBody Coupon coupon) {
		return new ResponseEntity<Coupon>(couponService.updateCoupon(coupon, id), HttpStatus.OK);
	}

	// build delete Coupon REST API
	// http://localhost:8080/api/coupon/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCoupon(@PathVariable("id") long id) {

		// delete Coupon from DB
		couponService.deleteCouponById(id);

		return new ResponseEntity<String>("Coupon deleted successfully!.", HttpStatus.OK);
	}

}
