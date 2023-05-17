package com.project.travel.api.DTO;

import java.util.Calendar;

public class ClientRequestDTO {
	
	private String destinationLocal;
	private String departureLocal;
	private int peopleNumber;
	private Calendar traveldate;
	
	
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
