package com.sousstalent.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sousstalent.exception.ResourceNotFoundException;
import com.sousstalent.model.Participant;
import com.sousstalent.repository.ParticipantRepository;
import com.sousstalent.service.ParticipantService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class ParticipantServiceImplementation implements ParticipantService {

	private ParticipantRepository participantRepository;

	@Override
	public List<Participant> getAllParticipants() {
		// TODO Auto-generated method stub
		return participantRepository.findAll();
	}

	@Override
	public Participant saveParticipant(Participant participant) {
		// TODO Auto-generated method stub
		return this.participantRepository.save(participant);
	}

	@Override
	public Participant getParticipantById(long id) {
		// TODO Auto-generated method stub
		return participantRepository.findById(id).get();
	}

	@Override
	public Participant updateParticipant(Participant participant, long id) {
		Participant existingParticipant = participantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Particpant", "Id", id));

		existingParticipant.setNom(participant.getNom());
		existingParticipant.setPrenom(participant.getPrenom());
		existingParticipant.setUsername(participant.getUsername());
		existingParticipant.setPassword(participant.getPassword());
		existingParticipant.setEmail(participant.getEmail());
		existingParticipant.setTelephone(participant.getTelephone());
		existingParticipant.setDomaine(participant.getDomaine());
		existingParticipant.setStructure(participant.getStructure());

		participantRepository.save(existingParticipant);

		return existingParticipant;
	}

	@Override
	public void deleteParticipantById(long id) {
		// TODO Auto-generated method stub
		this.participantRepository.deleteById(id);
	}
}
