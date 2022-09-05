package com.sousstalent.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sousstalent.model.Participant;
import com.sousstalent.service.ParticipantService;

@RestController
@RequestMapping("/api/participant")
public class ParticipantController {

	private ParticipantService participantService;

	public ParticipantController(ParticipantService participantService) {
//		super();
		this.participantService = participantService;
	}

	// build create participant REST API
	@PostMapping
	public ResponseEntity<Participant> save(@RequestBody Participant participant) {
		return new ResponseEntity<Participant>(participantService.saveParticipant(participant), HttpStatus.CREATED);
	}

	// build get all participants REST API
	@GetMapping
	public List<Participant> getAllParticipant() {
		return participantService.getAllParticipants();
	}

	// build get participant by id REST API
	// http://localhost:8080/api/participant/1
	@GetMapping("{id}")
	public ResponseEntity<Participant> getParticipantById(@PathVariable("id") long participantId) {
		return new ResponseEntity<Participant>(participantService.getParticipantById(participantId), HttpStatus.OK);
	}

	// build update participant REST API
	// http://localhost:8080/api/participants/1
	@PutMapping("{id}")
	public ResponseEntity<Participant> updateParticipant(@PathVariable("id") long id,
			@RequestBody Participant participant) {
		return new ResponseEntity<Participant>(participantService.updateParticipant(participant, id), HttpStatus.OK);
	}

	// build delete participant REST API
	// http://localhost:8080/api/participant/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteParticipant(@PathVariable("id") long id) {

		// delete participant from DB
		participantService.deleteParticipantById(id);

		return new ResponseEntity<String>("Participant deleted successfully!.", HttpStatus.OK);
	}
}
