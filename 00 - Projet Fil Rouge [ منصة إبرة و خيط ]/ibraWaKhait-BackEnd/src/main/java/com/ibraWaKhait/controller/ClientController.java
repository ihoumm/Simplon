package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Client;
import com.ibraWaKhait.service.ClientService;

public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	// build create Client REST API
			@PostMapping
			public ResponseEntity<Client> addClient(@RequestBody Client client) {
				return new ResponseEntity<Client>(clientService.addClient(client), HttpStatus.CREATED);
			}

			// build get all Client REST API
			@GetMapping()
			public List<Client> getAllClients() {
				return clientService.getAllClients();
			}

			// build get Client by id REST API
			// http://localhost:8080/api/Clients/1
			@GetMapping("{id}")
			public ResponseEntity<Client> getClientById(@PathVariable("id") long client_id) {
				return new ResponseEntity<Client>(clientService.getClientById(client_id), HttpStatus.OK);
			}

			// build update Client REST API
			// http://localhost:8080/api/Clients/1
			@PutMapping("{id}")
			public ResponseEntity<Client> updateClient(@PathVariable("id") long id, @RequestBody Client client) {
				return new ResponseEntity<Client>(clientService.updateClient(client, id), HttpStatus.OK);
			}

			// build delete Client REST API
			// http://localhost:8080/api/Clients/1
			@DeleteMapping("{id}")
			public ResponseEntity<String> deleteClient(@PathVariable("id") long id) {

				// delete Client from DB
				clientService.deleteClientById(id);

				return new ResponseEntity<String>("Client deleted successfully!.", HttpStatus.OK);
			}

}
