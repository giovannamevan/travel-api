package com.project.travel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.travel.api.entities.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {

}
