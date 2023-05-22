package com.project.travel.api.entities;

import com.project.travel.api.DTO.ClientRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client_requests")
public class ClientRequest {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String destinationLocal;
		private String departureLocal;
		private int peopleNumber;
		private String traveldate;
		


		public ClientRequest(ClientRequestDTO clientRequestDTO) {
			this.destinationLocal = clientRequestDTO.getDestinationLocal();
			this.departureLocal = clientRequestDTO.getDepartureLocal();
			this.peopleNumber = clientRequestDTO.getPeopleNumber();
			this.traveldate =  clientRequestDTO.getTraveldate();
		}
		
		
}
