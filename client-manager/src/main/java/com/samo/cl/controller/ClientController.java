package com.samo.cl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.samo.cl.entity.Client;
import com.samo.cl.service.ClientService;

@Controller
public class ClientController {

	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public String listClient(Model model) {
		model.addAttribute("clients", clientService.getAllClient());
		return "clients";
	}

	@GetMapping("/clients/add")
	public String createClientForm(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "create_client";

	}

	@PostMapping("/clients")
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.saveClient(client);
		return "redirect:/clients";
	}

}
