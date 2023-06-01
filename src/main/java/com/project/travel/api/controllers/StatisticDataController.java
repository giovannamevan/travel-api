package com.project.travel.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.travel.api.DTO.StatisticDataDTO;
import com.project.travel.api.service.StatisticDataService;

@RestController
@RequestMapping("dados")
public class StatisticDataController {

	@Autowired
	StatisticDataService dataService;
	
	@GetMapping
	public StatisticDataDTO getData () {
		return dataService.getDadosEstatisticos();
	}

}
