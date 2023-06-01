package com.project.travel.api.service;

import java.util.Iterator;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import com.project.travel.api.DTO.StatisticDataDTO;
import com.project.travel.api.entities.RoadMap;
import com.project.travel.api.repositories.RoteiroRepository;

@Service
public class StatisticDataService {
	
	@Autowired
	RoteiroRepository roteiroRepository;
	
	@Transactional
	public StatisticDataDTO getDadosEstatisticos () {
		List<RoadMap> result = roteiroRepository.findAll();
		Iterator<RoadMap> iter = result.iterator();
		double totalEarnings = 0;
		int peopleNum = 0;
		int ctSp = 0;
		int ctRj = 0;
		int ctSvd = 0;
		int ctCtb = 0;
		int ctRcf = 0;
		int highestVisitsNumber = 0;
		
		String mostVisitedCity = "";
		String[] cities = {"São Paulo", "Rio de Janeiro", "Salvador", "Curitiba", "Recife"};
		
		HashMap<String, Integer> dataCount = new HashMap<>();
		String mostInsertedDate = "";
		int mostDate = 0;
		
		HashMap<String, Integer> companhiaCount = new HashMap<>();
		String mostInsertedCompany = "";
		int mostCompany = 0;
		
		while (iter.hasNext()) {
		    RoadMap roteiro = iter.next();
		    String localName = roteiro.getLocalName();
		    String date = roteiro.getDepartionDate();
		    String ticketCompany = roteiro.getTicketCompany();
		    
		    totalEarnings += roteiro.getFinalPrice().doubleValue();
		    peopleNum += roteiro.getPeopleNumber(); 
		    
		    int count = dataCount.getOrDefault(date, 0) + 1;
		    dataCount.put(date, count);
		    if (count > mostDate) {
		        mostDate = count;
		        mostInsertedDate = date;
		    }
		    
		    int countCompany = companhiaCount.getOrDefault(ticketCompany, 0) + 1;
		    companhiaCount.put(ticketCompany, count);
		    if (countCompany > mostCompany) {
		        mostCompany = count;
		        mostInsertedCompany = ticketCompany;
		    }
		
		    
		    if (localName.equals("Sao Paulo")) {
		        ctSp++;
		    } else if (localName.equals("Rio de Janeiro")) {
		        ctRj++;
		    } else if (localName.equals("Salvador")) {
		        ctSvd++;
		    } else if (localName.equals("Curitiba")) {
		        ctCtb++;
		    } else if (localName.equals("Recife")) {
		        ctRcf++;
		    }
		}

		int[] cityVisits = {ctSp, ctRj, ctSvd, ctCtb, ctRcf};

		for (int i = 0; i < cityVisits.length; i++) {
		    if (cityVisits[i] > highestVisitsNumber) {
		        highestVisitsNumber = cityVisits[i];
		        mostVisitedCity = cities[i];
		    }
		    
		}
		
	    return new StatisticDataDTO(mostVisitedCity, totalEarnings, peopleNum, mostInsertedDate, mostInsertedCompany);
	}
	
}
