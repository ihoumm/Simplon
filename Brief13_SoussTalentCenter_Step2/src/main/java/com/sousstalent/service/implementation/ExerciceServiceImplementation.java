package com.sousstalent.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sousstalent.exeption.ResourceNotFoundException;
import com.sousstalent.model.Exercice;
import com.sousstalent.repository.ExerciceRepository;
import com.sousstalent.service.ExerciceService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExerciceServiceImplementation implements ExerciceService {
	
	private ExerciceRepository exerciceRepository;
	
	@Override
	public List<Exercice> getAllExercices() {
		// TODO Auto-generated method stub
		return exerciceRepository.findAll();
	}

	@Override
	public Exercice saveExercice(Exercice exercice) {
		// TODO Auto-generated method stub
		return this.exerciceRepository.save(exercice);
	}

	@Override
	public Exercice getExerciceById(long id) {
		
//		Optional<Exercice> exercice = exerciceRepository.findById(id);
//		if(exercice.isPresent()) {
//			return exercice.get();
//		}else {
//			throw new ResourceNotFoundException("Exercice", "Id", id);
//		}
		
		// TODO Auto-generated method stub
		return exerciceRepository.findById(id).get();
	}

	@Override
	public Exercice updateExercice(Exercice exercice, long id) {
		Exercice existingExercice = exerciceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Exercice", "Id", id));

		existingExercice.setID(exercice.getID());
		existingExercice.setAnnee(exercice.getAnnee());
		existingExercice.setDate_debut(exercice.getDate_debut());
		existingExercice.setDate_fin(exercice.getDate_fin());
		existingExercice.setStatut(exercice.getStatut());
		

		exerciceRepository.save(existingExercice);

		return existingExercice;
	}

	@Override
	public void deleteExerciceById(long id) {
		// TODO Auto-generated method stub
		this.exerciceRepository.deleteById(id);
	}

}
