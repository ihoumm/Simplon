package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Seller;

public interface SellerService {
	
	List<Seller> getAllSellers();
	
	Seller addSeller(Seller seller);
	
	Seller getSellerById(Long id);
	
	Seller updateSeller(Seller seller, Long id);
	
	void deleteSellerById(Long id);

}
