package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ibraWaKhait.model.Coupon;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "coupons", path = "coupons")
public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
