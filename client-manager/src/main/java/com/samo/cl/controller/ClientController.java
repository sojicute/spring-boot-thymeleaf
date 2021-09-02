package com.samo.cl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
