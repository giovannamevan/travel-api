package com.project.travel.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.travel.api.DTO.ClientRequestDTO;

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
