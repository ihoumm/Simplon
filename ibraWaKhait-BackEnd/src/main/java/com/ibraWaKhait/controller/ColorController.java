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

import com.ibraWaKhait.model.Color;
import com.ibraWaKhait.service.ColorService;

public class ColorController {

	private ColorService colorService;

	public ColorController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}

	// build create Color REST API
	@PostMapping
	public ResponseEntity<Color> save(@RequestBody Color color) {
		return new ResponseEntity<Color>(colorService.addColor(color), HttpStatus.CREATED);
	}

	// build get all Color REST API
	@GetMapping
	public List<Color> getAlls() {
		return colorService.getAllColors();
	}

	// build get Color by id REST API
	// http://localhost:8080/api/color/1
	@GetMapping("{id}")
	public ResponseEntity<Color> getColorById(@PathVariable("id") long color_id) {
		return new ResponseEntity<Color>(colorService.getColorById(color_id), HttpStatus.OK);
	}

	// build update Color REST API
	// http://localhost:8080/api/color/1
	@PutMapping("{id}")
	public ResponseEntity<Color> updateColor(@PathVariable("id") long id, @RequestBody Color color) {
		return new ResponseEntity<Color>(colorService.updateColor(color, id), HttpStatus.OK);
	}

	// build delete Color REST API
	// http://localhost:8080/api/color/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteColor(@PathVariable("id") long id) {

		// delete activite from DB
		colorService.deleteColoryById(id);
		;

		return new ResponseEntity<String>("Color deleted successfully!.", HttpStatus.OK);
	}

}
