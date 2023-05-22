package com.project.travel.api.DTO;

import jakarta.validation.constraints.NotBlank;

public class ClientRequestDTO {
	
	
	@NotBlank
	private String destinationLocal;
	@NotBlank
	private String departureLocal;
	@NotBlank
	private int peopleNumber;
	private String traveldate;
	
	public ClientRequestDTO(String destinationLocal, String departureLocal, int peopleNumber, String traveldate) {
		
		this.destinationLocal = destinationLocal;
		this.departureLocal = departureLocal;
		this.peopleNumber = peopleNumber;
		this.traveldate = traveldate;
	}
	public ClientRequestDTO () {
		
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

	public int getPeopleNumber() {
		return peopleNumber;
	}

	public void setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	public String getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}
	
	
	
}
