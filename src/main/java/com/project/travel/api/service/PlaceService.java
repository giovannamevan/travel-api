package com.project.travel.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.travel.api.DTO.PlaceDTO;
import com.project.travel.api.entities.Place;
import com.project.travel.api.repositories.PlaceRepository;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository placeRepository;
	
	@Transactional
	public PlaceDTO findPlaceByCity (String city) {
		Place result = placeRepository.findPlaceByCity(city);
		return new PlaceDTO(result);
	} 
		
	
}
