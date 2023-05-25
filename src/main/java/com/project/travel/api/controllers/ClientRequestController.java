package com.project.travel.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.travel.api.DTO.ClientRequestDTO;
import com.project.travel.api.DTO.PlaceDTO;
import com.project.travel.api.DTO.TicketDTO;
import com.project.travel.api.entities.ClientRequest;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.Ticket;
import com.project.travel.api.repositories.ClientRequestRepository;
import com.project.travel.api.repositories.PlaceRepository;
import com.project.travel.api.service.PlaceService;

@RestController
@RequestMapping("clients")
public class ClientRequestController {
	
		@Autowired
		private ClientRequestRepository clientRequestRepository;
		
		@Autowired
		private PlaceService placeService;
		
		
		@PostMapping
		@Transactional
		public void postRequest(@RequestBody @Valid ClientRequestDTO clientRequestDTO) {
			clientRequestRepository.save(new ClientRequest(clientRequestDTO));
		}

		@GetMapping("/local/{city}")
		public ResponseEntity<PlaceDTO> findPlaceByCity(@PathVariable String city) {
			   return ResponseEntity.ok(placeService.findPlaceByCity(city));
		}
}
