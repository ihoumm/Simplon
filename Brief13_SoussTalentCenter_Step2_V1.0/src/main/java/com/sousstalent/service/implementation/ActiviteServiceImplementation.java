package com.sousstalent.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sousstalent.exception.ResourceNotFoundException;
import com.sousstalent.model.Activite;
import com.sousstalent.repository.ActiviteRepository;
import com.sousstalent.service.ActiviteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ActiviteServiceImplementation implements ActiviteService{

	private ActiviteRepository activiteRepository;

	@Override
	public List<Activite> getAllActivites() {
		// TODO Auto-generated method stub
		return activiteRepository.findAll();
	}

	@Override
	public Activite saveActivite(Activite activite) {
		// TODO Auto-generated method stub
		return this.activiteRepository.save(activite);
	}

	@Override
	public Activite getActiviteById(long id) {
		// TODO Auto-generated method stub
		return activiteRepository.findById(id).get();
	}

	@Override
	public Activite updateActivite(Activite activite, long id) {
		Activite existingActivite = activiteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("activiteRepository", "Id", id));

		existingActivite.setTitre(activite.getTitre());
		existingActivite.setDescpritif(activite.getDescpritif());
		existingActivite.setType(activite.getType());
		existingActivite.setDate_debut(activite.getDate_debut());
		existingActivite.setDate_fin(activite.getDate_fin());
		existingActivite.setEtat(activite.getEtat());

		activiteRepository.save(existingActivite);

		return existingActivite;
	}

	@Override
	public void deleteActiviteById(long id) {
		// TODO Auto-generated method stub
		this.activiteRepository.deleteById(id);
	}
}