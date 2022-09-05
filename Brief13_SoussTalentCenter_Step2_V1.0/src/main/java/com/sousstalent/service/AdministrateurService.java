package com.sousstalent.service;

import java.util.List;

import com.sousstalent.model.Administrateur;

public interface AdministrateurService {
	
	List<Administrateur> getAllAdministrateurs();

	Administrateur saveAdministrateur(Administrateur administrateur);
	
	Administrateur getAdministrateurById(long id);
	
	Administrateur updateAdministrateur(Administrateur administrateur, long id);

	void deleteAdministrateurById(long id);
}
