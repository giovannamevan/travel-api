package com.project.travel.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.travel.api.DTO.ClientRequestDTO;
import com.project.travel.api.entities.ClientRequest;
import com.project.travel.api.repositories.ClientRequestRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("clients")
public class ClientRequestController {
	
		@Autowired
		private ClientRequestRepository clientRequestRepository;
		
		@PostMapping
		@Transactional
		public void postRequest(@RequestBody @Valid ClientRequestDTO clientRequestDTO) {
			clientRequestRepository.save(new ClientRequest(clientRequestDTO));
		}
}
