package com.samo.cl.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samo.cl.entity.Client;
import com.samo.cl.repository.ClientRepository;
import com.samo.cl.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	
	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}

}
