package com.project.travel.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.travel.api.DTO.ClientRequestDTO;
import com.project.travel.api.repositories.ClientRequestRepository;

@RestController
@RequestMapping("/clients")
public class ClientRequestController {
	
		@Autowired
		ClientRequestRepository clientRequestRepository;
		
		@PostMapping
		public void postRequest(@RequestBody ClientRequestDTO clientRequestDTO) {
			System.out.println(clientRequestDTO);
		}
}
