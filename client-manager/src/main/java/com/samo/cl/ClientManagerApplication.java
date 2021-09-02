package com.samo.cl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samo.cl.entity.Client;
import com.samo.cl.repository.ClientRepository;

@SpringBootApplication
public class ClientManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClientManagerApplication.class, args);
	}

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {

		Client client1 = new Client("Joline", "Kudjo", "joline@mail.com");
		clientRepository.save(client1);
		
		Client client2 = new Client("Josuke", "Higashikata", "higashikata@mail.com");
		clientRepository.save(client2);

	}

}
