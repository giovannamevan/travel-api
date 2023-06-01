package com.project.travel.api.DTO;

import java.math.BigDecimal;

import com.project.travel.api.entities.Hosting;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.RoadMap;
import com.project.travel.api.entities.Ticket;
import com.project.travel.api.entities.Tour;

public class RoadMapDTO {
	
	private Long id;
	
	private String departionDate;
	private int peopleNumber;
	private BigDecimal finalPrice;
	private String localName;
	private String hostingName;
	private BigDecimal hostingPrice;
	private String tourName;
	private BigDecimal tourPrice;
	private BigDecimal ticketPrice;
	private String ticketCompany;
	
	public RoadMapDTO (){
		
	}
	
	public RoadMapDTO (RoadMap entity) {
		this.id = entity.getId();
		this.departionDate = entity.getDepartionDate();
		this.peopleNumber = entity.getPeopleNumber();
		this.finalPrice = entity.getFinalPrice();
		this.localName = entity.getLocalName();
		this.hostingName = entity.getHostingName();
		this.hostingPrice = entity.getHostingPrice();
		this.tourName = entity.getTourName();
		this.tourPrice = entity.getTourPrice();
		this.ticketPrice = entity.getTicketPrice();
		this.ticketCompany = entity.getTicketCompany();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartionDate() {
		return departionDate;
	}
	public void setDepartionDate(String departionDate) {
		this.departionDate = departionDate;
	}
	public int getPeopleNumber() {
		return peopleNumber;
	}
	public void setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}
	public BigDecimal getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getHostingName() {
		return hostingName;
	}
	public void setHostingName(String hostingName) {
		this.hostingName = hostingName;
	}
	public BigDecimal getHostingPrice() {
		return hostingPrice;
	}
	public void setHostingPrice(BigDecimal hostingPrice) {
		this.hostingPrice = hostingPrice;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public BigDecimal getTourPrice() {
		return tourPrice;
	}
	public void setTourPrice(BigDecimal tourPrice) {
		this.tourPrice = tourPrice;
	}
	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketCompany() {
		return ticketCompany;
	}

	public void setTicketCompany(String ticketCompany) {
		this.ticketCompany = ticketCompany;
	}
	
	
	
}
