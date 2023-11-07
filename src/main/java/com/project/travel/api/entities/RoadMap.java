package com.project.travel.api.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.travel.api.DTO.RoadMapDTO;

@Entity
@Table(name = "tb_roadmaps")
public class RoadMap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public RoadMap() {
	}

	public RoadMap(RoadMapDTO DTO) {
		this.id = DTO.getId();
		this.departionDate = DTO.getDepartionDate();
		this.peopleNumber = DTO.getPeopleNumber();
		this.finalPrice = DTO.getFinalPrice();
		this.localName = DTO.getLocalName();
		this.hostingName = DTO.getHostingName();
		this.hostingPrice = DTO.getHostingPrice();
		this.tourName = DTO.getTourName();
		this.tourPrice = DTO.getTourPrice();
		this.ticketPrice = DTO.getTicketPrice();
		this.ticketCompany = DTO.getTicketCompany();
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
