package com.project.travel.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.travel.api.DTO.PlaceDTO;
import com.project.travel.api.DTO.RoteiroDTO;
import com.project.travel.api.service.PlaceService;
import com.project.travel.api.service.RoteiroService;

@RestController
@RequestMapping("clients")
public class ClientRequestController {
	
		@Autowired
		private PlaceService placeService;
		
		@GetMapping("/local/{city}")
		public ResponseEntity<PlaceDTO> findPlaceByCity(@PathVariable String city) {
			   return ResponseEntity.ok(placeService.findPlaceByCity(city));
		}
		
		@Autowired
		RoteiroService roteiroService;
		
		
		@PostMapping(value = "/postRoteiro")
		public void postRoteiro(@RequestBody RoteiroDTO roteiroDTO) {
			  roteiroService.saveRoteiro(roteiroDTO);
		}
}
