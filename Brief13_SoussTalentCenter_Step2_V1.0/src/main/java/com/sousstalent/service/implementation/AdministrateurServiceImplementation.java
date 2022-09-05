package com.sousstalent.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sousstalent.exception.ResourceNotFoundException;
import com.sousstalent.model.Administrateur;
import com.sousstalent.repository.AdministrateurRepository;
import com.sousstalent.service.AdministrateurService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class AdministrateurServiceImplementation implements AdministrateurService {

	private AdministrateurRepository administrateurRepository;

	@Override
	public List<Administrateur> getAllAdministrateurs() {
		// TODO Auto-generated method stub
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		// TODO Auto-generated method stub
		return this.administrateurRepository.save(administrateur);
	}

	@Override
	public Administrateur getAdministrateurById(long id) {
		// TODO Auto-generated method stub
		return administrateurRepository.findById(id).get();
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur administrateur, long id) {
		Administrateur existingAdministrateur = administrateurRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("administrateurRepository", "Id", id));

		existingAdministrateur.setNom(administrateur.getNom());
		existingAdministrateur.setPrenom(administrateur.getPrenom());
		existingAdministrateur.setUsername(administrateur.getUsername());
		existingAdministrateur.setPassword(administrateur.getPassword());
		existingAdministrateur.setEmail(administrateur.getEmail());
		existingAdministrateur.setTelephone(administrateur.getTelephone());
		existingAdministrateur.setEtat(administrateur.getEtat());

		administrateurRepository.save(existingAdministrateur);

		return existingAdministrateur;
	}

	@Override
	public void deleteAdministrateurById(long id) {
		// TODO Auto-generated method stub
		this.administrateurRepository.deleteById(id);
	}
}
