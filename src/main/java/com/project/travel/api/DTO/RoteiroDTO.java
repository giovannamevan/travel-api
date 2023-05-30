package com.project.travel.api.DTO;

import java.math.BigDecimal;

import com.project.travel.api.entities.Hosting;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.Roteiro;
import com.project.travel.api.entities.Ticket;
import com.project.travel.api.entities.Tour;

public class RoteiroDTO {
	
	private Long id;
	private String departionDate;
	private int peopleNumber;
	private BigDecimal finalPrice;
	private Place place;
	private Hosting hosting;
	private Tour tour;
	private Ticket ticket;
	
	public RoteiroDTO () {
		
	}
	
	public RoteiroDTO (Roteiro entity) {
		this.id = entity.getId();
		this.departionDate = entity.getDepartionDate();
		this.peopleNumber = entity.getPeopleNumber();
		this.finalPrice = entity.getFinalPrice();
		this.place = entity.getPlace();
		this.hosting = entity.getHosting();
		this.tour = entity.getTour();
		this.ticket = entity.getTicket();
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
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public Hosting getHosting() {
		return hosting;
	}
	public void setHosting(Hosting hosting) {
		this.hosting = hosting;
	}
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
}
