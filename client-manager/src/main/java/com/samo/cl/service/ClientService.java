package com.samo.cl.service;

import java.util.List;

import com.samo.cl.entity.Client;

public interface ClientService {
	List<Client> getAllClient();
	
	Client saveClient(Client client);
	
	Client getClientById(Long id);
	
	Client updateClient(Client client);
	
	void deleteClientById(Long id);
}
