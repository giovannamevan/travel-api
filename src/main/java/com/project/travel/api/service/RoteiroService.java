package com.project.travel.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.travel.api.DTO.RoadMapDTO;
import com.project.travel.api.entities.RoadMap;
import com.project.travel.api.repositories.RoteiroRepository;

@Service
public class RoteiroService {
	@Autowired
	RoteiroRepository roteiroRepository;

	@Transactional
	public void saveRoteiro(RoadMapDTO roteiroDTO) {
		roteiroRepository.save(new RoadMap(roteiroDTO));
	}

}
