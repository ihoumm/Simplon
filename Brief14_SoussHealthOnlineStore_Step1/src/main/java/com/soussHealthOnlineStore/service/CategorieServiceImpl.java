package com.soussHealthOnlineStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soussHealthOnlineStore.entity.Categorie;
import com.soussHealthOnlineStore.repository.CategorieRepository;

@Service
public class CategorieServiceImpl implements PharmacieServices<Categorie>{

	@Autowired
	private CategorieRepository categorieRepository;
	
	
	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		super();
		this.categorieRepository = categorieRepository;
	}

	@Override
	public List<Categorie> getAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie getById(Long id) {
		return categorieRepository.findById(id).get();
	}

	@Override
	public Categorie save(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public void update(Categorie categorie, Long id) {
		Categorie categorie1 = categorieRepository.findById(id).get();
		categorie1.setNameCat(categorie.getNameCat());
		
	}

	@Override
	public void delete(Long id) {
		categorieRepository.deleteById(id);
		
	}

	@Override
	public List<Categorie> findByNameOrPartName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
