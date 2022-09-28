package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Client;

public interface ClientService {
	
	List<Client> getAllClients();
	
	Client addClient(Client client);
	
	Client getClientById(Long id);
	
	Client updateClient(Client client,Long id);
	
	void deleteClientById(Long id);

}
