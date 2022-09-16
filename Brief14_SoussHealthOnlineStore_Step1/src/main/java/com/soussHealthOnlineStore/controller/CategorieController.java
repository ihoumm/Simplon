package com.soussHealthOnlineStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.soussHealthOnlineStore.entity.Categorie;
import com.soussHealthOnlineStore.service.CategorieServiceImpl;



@RestController
@RequestMapping("/api/v1/pharmacie/categories")
public class CategorieController {
	@Autowired
	private CategorieServiceImpl catImpl;

	public CategorieController(CategorieServiceImpl catImpl) {
		super();
		this.catImpl = catImpl;
	}

	@GetMapping("/allCategories")
	  List<Categorie> findAll() {
	    return catImpl.getAll();

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Categorie createCategorie(@RequestBody Categorie categorie) {
		return catImpl.save(categorie);
}
	
	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categorie getCategorieByIdCategorie(@PathVariable Long id) {
		return catImpl.getById(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Categorie>  updateCategorie(@PathVariable("id") Long id, @RequestBody Categorie categorie) {
		catImpl.update(categorie, id);
		return  new ResponseEntity<>(catImpl.getById(id), HttpStatus.OK) ;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteCategorie(@PathVariable Long id) {
		catImpl.delete(id);

	}
}
	
