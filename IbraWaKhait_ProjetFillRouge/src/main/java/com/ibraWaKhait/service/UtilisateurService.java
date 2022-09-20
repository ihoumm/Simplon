package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Utilisateur;


public interface UtilisateurService {
	
	List<Utilisateur> getAllAdmins();

	Utilisateur saveAdmin(Utilisateur utilisateur);
	
	Utilisateur getAdminById(long id);
	
	Utilisateur updateAdministrateur(Utilisateur administrateur, long id);

	void deleteAdminById(long id);
	
}
