package com.sousstalent.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import com.sousstalent.exeption.ResourceNotFoundException;
import com.sousstalent.model.Responsable;
import com.sousstalent.repository.ResponsableRepository;
import com.sousstalent.service.ResponsableService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResponsableServiceImplementation implements ResponsableService {

	private ResponsableRepository responsableRepository;

	@Override
	public List<Responsable> getAllResponsables() {
		// TODO Auto-generated method stub
		return responsableRepository.findAll();
	}

	@Override
	public Responsable saveResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		return this.responsableRepository.save(responsable);
	}

	@Override
	public Responsable getResponsableById(long id) {
		
//		Optional<Responsable> responsable = responsableRepository.findById(id);
//		if(responsable.isPresent()) {
//			return responsable.get();
//		}else {
//			throw new ResourceNotFoundException("Responsable", "Id", id);
//		}
		
		// TODO Auto-generated method stub
		return responsableRepository.findById(id).get();
	}

	@Override
	public Responsable updateResponsable(Responsable responsable, long id) {
		
		Responsable existingResponsable = responsableRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Responsable", "Id", id));

		existingResponsable.setNom(responsable.getNom());
		existingResponsable.setPrenom(responsable.getPrenom());
		existingResponsable.setLogin(responsable.getLogin());
		existingResponsable.setPassword(responsable.getPassword());
		existingResponsable.setEmail(responsable.getEmail());
		existingResponsable.setTelephone(responsable.getTelephone());
		existingResponsable.setDomaine(responsable.getDomaine());
		existingResponsable.setType(responsable.getType());
		existingResponsable.setEtat(responsable.getEtat());

		responsableRepository.save(existingResponsable);

		return existingResponsable;
	}

	@Override
	public void deleteResponsableById(long id) {
		// TODO Auto-generated method stub
		this.responsableRepository.deleteById(id);
	}

}
