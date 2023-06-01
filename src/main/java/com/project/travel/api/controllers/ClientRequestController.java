package com.project.travel.api.controllers;


import java.util.Iterator;

import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.travel.api.DTO.PlaceDTO;
import com.project.travel.api.DTO.RoadMapDTO;
import com.project.travel.api.service.PlaceService;
import com.project.travel.api.service.RoteiroService;

@RestController
@RequestMapping("clients")
public class ClientRequestController {
	
		@Autowired
		private PlaceService placeService;
		
		@GetMapping(value = "/roadmap/{city}")
		public ResponseEntity<PlaceDTO> findRoadMap (@PathVariable  String city){
			return ResponseEntity.ok(placeService.getRandomRoadMap(city));
		}
		
		@GetMapping("/all/{city}")
		public ResponseEntity<PlaceDTO> findPlaceByCity(@PathVariable String city) {
			   return ResponseEntity.ok(placeService.findPlaceByCity(city));
		}
		
		@Autowired
		RoteiroService roteiroService;
		
		@PostMapping(value = "/roteiro")
		public void postRoteiro(@RequestBody RoadMapDTO roteiroDTO) {
			  roteiroService.saveRoteiro(roteiroDTO);
		}
		
}
