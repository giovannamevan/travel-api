package com.project.travel.api.entities;

import java.util.Calendar;

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
		private Calendar traveldate;
		
		public ClientRequest () {
			
		}

		public ClientRequest(Long id, String destinationLocal, String departureLocal, Integer peopleNumber,
				Calendar traveldate) {
			super();
			this.id = id;
			this.destinationLocal = destinationLocal;
			this.departureLocal = departureLocal;
			this.peopleNumber = peopleNumber;
			this.traveldate = traveldate;
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

		public Calendar getTraveldate() {
			return traveldate;
		}

		public void setTraveldate(Calendar traveldate) {
			this.traveldate = traveldate;
		}
		
		
		
		
		
}
