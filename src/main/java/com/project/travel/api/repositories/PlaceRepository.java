package com.project.travel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.travel.api.entities.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
			
		Place findPlaceByCity(String city);

}
