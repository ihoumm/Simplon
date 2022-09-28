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

import com.ibraWaKhait.model.DeliveryMethod;
import com.ibraWaKhait.service.DeliveryMethodService;

public class DeliveryMethodController {

	private DeliveryMethodService deliveryMethodService;

	public DeliveryMethodController(DeliveryMethodService deliveryMethodService) {
		super();
		this.deliveryMethodService = deliveryMethodService;
	}

	// build create DeliveryMethod REST API
	@PostMapping
	public ResponseEntity<DeliveryMethod> addDeliveryMethod(@RequestBody DeliveryMethod deliveryMethod) {
		return new ResponseEntity<DeliveryMethod>(deliveryMethodService.addDeliveryMethod(deliveryMethod),
				HttpStatus.CREATED);
	}

	// build get all DeliveryMethod REST API
	@GetMapping
	public List<DeliveryMethod> getAllDeliveryMethods() {
		return deliveryMethodService.getAllDeliveryMethods();
	}

	// build get DeliveryMethod by id REST API
	// http://localhost:8080/api/deliveryMethod/1
	@GetMapping("{id}")
	public ResponseEntity<DeliveryMethod> getDeliveryMethodById(@PathVariable("id") long deliveryMethod_id) {
		return new ResponseEntity<DeliveryMethod>(deliveryMethodService.getDeliveryMethodById(deliveryMethod_id),
				HttpStatus.OK);
	}

	// build update DeliveryMethod REST API
	// http://localhost:8080/api/deliveryMethod/1
	@PutMapping("{id}")
	public ResponseEntity<DeliveryMethod> updateDeliveryMethod(@PathVariable("id") long id,
			@RequestBody DeliveryMethod deliveryMethod) {
		return new ResponseEntity<DeliveryMethod>(deliveryMethodService.updateDeliveryMethod(deliveryMethod, id),
				HttpStatus.OK);
	}

	// build delete DeliveryMethod REST API
	// http://localhost:8080/api/deliveryMethod/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDeliveryMethod(@PathVariable("id") long id) {

		// delete DeliveryMethod from DB
		deliveryMethodService.deleteDeliveryMethodById(id);

		return new ResponseEntity<String>("DeliveryMethod deleted successfully!.", HttpStatus.OK);
	}

}
