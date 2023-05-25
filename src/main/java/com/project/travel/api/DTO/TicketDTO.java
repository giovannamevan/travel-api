package com.project.travel.api.DTO;

import java.math.BigDecimal;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.Ticket;

public class TicketDTO {

	private Long id;
	private String departionDate;
	private Place destinationLocal;
	private String originLocal;
	private BigDecimal ticketPrice;
	
	public TicketDTO (Ticket entity) {
		  this.id = entity.getId();
		  this.departionDate = entity.getDepartionDate();
		  this.destinationLocal = entity.getDestinationLocal();
		  this.originLocal = entity.getOriginLocal();
		  this.ticketPrice = entity.getTicketPrice();
		  
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

	public Place getDestinationLocal() {
		return destinationLocal;
	}

	public void setDestinationLocal(Place destinationLocal) {
		this.destinationLocal = destinationLocal;
	}

	public String getOriginLocal() {
		return originLocal;
	}

	public void setOriginLocal(String originLocal) {
		this.originLocal = originLocal;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
}
