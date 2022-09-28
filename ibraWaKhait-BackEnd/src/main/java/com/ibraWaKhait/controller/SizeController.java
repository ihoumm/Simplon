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

import com.ibraWaKhait.model.Size;
import com.ibraWaKhait.service.SizeService;

public class SizeController {

	private SizeService sizeService;

	public SizeController(SizeService sizeService) {
		super();
		this.sizeService = sizeService;
	}

	// build create Size REST API
	@PostMapping
	public ResponseEntity<Size> addSize(@RequestBody Size size) {
		return new ResponseEntity<Size>(sizeService.addSize(size), HttpStatus.CREATED);
	}

	// build get all Size REST API
	@GetMapping
	public List<Size> getAllSizes() {
		return sizeService.getAllSizes();
	}

	// build get Size by id REST API
	// http://localhost:8080/api/size/1
	@GetMapping("{id}")
	public ResponseEntity<Size> getSizeById(@PathVariable("id") long size_id) {
		return new ResponseEntity<Size>(sizeService.getSizeById(size_id), HttpStatus.OK);
	}

	// build update Size REST API
	// http://localhost:8080/api/size/1
	@PutMapping("{id}")
	public ResponseEntity<Size> updateSize(@PathVariable("id") long id, @RequestBody Size size) {
		return new ResponseEntity<Size>(sizeService.updateSize(size, id), HttpStatus.OK);
	}

	// build delete Size REST API
	// http://localhost:8080/api/size/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSize(@PathVariable("id") long id) {

		// delete Size from DB
		sizeService.deleteSizeById(id);

		return new ResponseEntity<String>("Size deleted successfully!.", HttpStatus.OK);
	}

}
