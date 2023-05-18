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
		
		public ClientRequest () {
			
		}

		public ClientRequest(Long id, String destinationLocal, String departureLocal, Integer peopleNumber,
				String traveldate) {
			super();
			this.id = id;
			this.destinationLocal = destinationLocal;
			this.departureLocal = departureLocal;
			this.peopleNumber = peopleNumber;
			this.traveldate = traveldate;
		}

		public ClientRequest(ClientRequestDTO clientRequestDTO) {
			this.destinationLocal = clientRequestDTO.getDestinationLocal();
			this.departureLocal = clientRequestDTO.getDepartureLocal();
			this.peopleNumber = clientRequestDTO.getPeopleNumber();
			this.traveldate =  clientRequestDTO.getTraveldate();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDestinationLocal() {
			return destinationLocal;
		}

		public void setDestinationLocal(String destinationLocal) {
			this.destinationLocal = destinationLocal;
		}

		public String getDepartureLocal() {
			return departureLocal;
		}

		public void setDepartureLocal(String departureLocal) {
			this.departureLocal = departureLocal;
		}

		public Integer getPeopleNumber() {
			return peopleNumber;
		}

		public void setPeopleNumber(Integer peopleNumber) {
			this.peopleNumber = peopleNumber;
		}

		public String getTraveldate() {
			return traveldate;
		}

		public void setTraveldate(String traveldate) {
			this.traveldate = traveldate;
		}
		
		
		
		
		
}
