package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Client;
import com.ibraWaKhait.repository.ClientRepository;
import com.ibraWaKhait.service.ClientService;

public class ClientServiceImplementation implements ClientService {
	
	private ClientRepository clientRepository;

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return this.clientRepository.findAll();
	}

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return this.clientRepository.findById(id).get();
	}

	@Override
	public Client updateClient(Client client, Long id) {
		Client exestingClient = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("clientRepository", "id", id));
		
		exestingClient.setId(client.getId());
		exestingClient.setFirst_name(client.getFirst_name());
		exestingClient.setLast_name(client.getLast_name());
		exestingClient.setUsername(client.getUsername());
		exestingClient.setPassword(client.getPassword());
		exestingClient.setEmail(client.getEmail());
		exestingClient.setAddress(client.getAddress());
		exestingClient.setCountry(client.getCountry());
		exestingClient.setCity(client.getCity());
		exestingClient.setZipCode(client.getZipCode());
		exestingClient.setPhoneNumber(client.getPhoneNumber());
		exestingClient.setRole(client.getRole());
		
		
		clientRepository.save(exestingClient);
		
		return exestingClient;
	}

	@Override
	public void deleteClientById(Long id) {

		this.clientRepository.deleteById(id);
		
	}

}
