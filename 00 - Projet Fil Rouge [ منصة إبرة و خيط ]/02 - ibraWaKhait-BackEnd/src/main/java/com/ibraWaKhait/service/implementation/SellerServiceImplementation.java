package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Seller;
import com.ibraWaKhait.repository.SellerRepository;
import com.ibraWaKhait.service.SellerService;

public class SellerServiceImplementation implements SellerService {
	
	private SellerRepository sellerRepository;

	@Override
	public List<Seller> getAllSellers() {
		// TODO Auto-generated method stub
		return this.sellerRepository.findAll();
	}

	@Override
	public Seller addSeller(Seller seller) {
		// TODO Auto-generated method stub
		return sellerRepository.save(seller);
	}

	@Override
	public Seller getSellerById(Long id) {
		// TODO Auto-generated method stub
		return this.sellerRepository.findById(id).get();
	}

	@Override
	public Seller updateSeller(Seller seller, Long id) {

		Seller exestingSeller = sellerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("sellerRepository", "id", id));
		
		exestingSeller.setId(seller.getId());
		exestingSeller.setFirst_name(seller.getFirst_name());
		exestingSeller.setLast_name(seller.getLast_name());
		exestingSeller.setUsername(seller.getUsername());
		exestingSeller.setPassword(seller.getPassword());
		exestingSeller.setAccount_status(seller.getAccount_status());
		exestingSeller.setRole(seller.getRole());
		
		sellerRepository.save(exestingSeller);
		
		return exestingSeller;
	}

	@Override
	public void deleteSellerById(Long id) {
		this.sellerRepository.deleteById(id);
	}

}
