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

import com.ibraWaKhait.model.Seller;
import com.ibraWaKhait.service.SellerService;

public class SellerController {
	
	private SellerService sellerService;

	public SellerController(SellerService sellerService) {
		super();
		this.sellerService = sellerService;
	}
	// build create Seller REST API
				@PostMapping
				public ResponseEntity<Seller> addSeller(@RequestBody Seller seller) {
					return new ResponseEntity<Seller>(sellerService.addSeller(seller), HttpStatus.CREATED);
				}

				// build get all Seller REST API
				@GetMapping()
				public List<Seller> getAllSellers() {
					return sellerService.getAllSellers();
				}

				// build get Seller by id REST API
				// http://localhost:8080/api/Sellers/1
				@GetMapping("{id}")
				public ResponseEntity<Seller> getSellerById(@PathVariable("id") long seller_id) {
					return new ResponseEntity<Seller>(sellerService.getSellerById(seller_id), HttpStatus.OK);
				}

				// build update Seller REST API
				// http://localhost:8080/api/Sellers/1
				@PutMapping("{id}")
				public ResponseEntity<Seller> updateSeller(@PathVariable("id") long id, @RequestBody Seller seller) {
					return new ResponseEntity<Seller>(sellerService.updateSeller(seller, id), HttpStatus.OK);
				}

				// build delete Seller REST API
				// http://localhost:8080/api/Sellers/1
				@DeleteMapping("{id}")
				public ResponseEntity<String> deleteSeller(@PathVariable("id") long id) {

					// delete Seller from DB
					sellerService.deleteSellerById(id);

					return new ResponseEntity<String>("Seller deleted successfully!.", HttpStatus.OK);
				}

}
