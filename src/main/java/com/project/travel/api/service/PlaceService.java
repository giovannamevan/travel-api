package com.project.travel.api.service;

import java.util.Iterator;


import java.util.Random;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.travel.api.DTO.PlaceDTO;
import com.project.travel.api.entities.Place;
import com.project.travel.api.repositories.PlaceRepository;
import java.util.Collections;


@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository placeRepository;
	
	@Transactional
	public PlaceDTO findPlaceByCity (String city) {
		Place result = placeRepository.findPlaceByCity(city);
		return new PlaceDTO(result);
	} 
	
	public <T> T getRandomSet(Set<T> set) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        int randomIndex = new Random().nextInt(set.size());
        Iterator<T> iterator = set.iterator();
        for (int i = 0; i < randomIndex; i++) {
            iterator.next();
        }
        return iterator.next();
    }

    public PlaceDTO getRandomRoadMap(String city) {
        Place place = placeRepository.findPlaceByCity(city);  
        if (place == null) {
            return null;
        }
        PlaceDTO roadMapPlaceDTO = new PlaceDTO(place);
        roadMapPlaceDTO.setTickets(Collections.singleton(getRandomSet(place.getTickets())));
        roadMapPlaceDTO.setHostings(Collections.singleton(getRandomSet(place.getHostings())));
        roadMapPlaceDTO.setTours(Collections.singleton(getRandomSet(place.getTours())));
        return roadMapPlaceDTO;
    }

}
