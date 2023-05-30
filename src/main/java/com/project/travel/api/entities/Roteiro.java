package com.project.travel.api.entities;

import java.math.BigDecimal;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.travel.api.DTO.RoteiroDTO;

@Entity
@Table(name = "tb_roteiros")
public class Roteiro {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String departionDate;
		private int peopleNumber;
		private BigDecimal finalPrice;
		
		@ManyToOne
		@JoinColumn(name = "place_id",
				referencedColumnName = "place_id",
				foreignKey = @ForeignKey (name = "place_fk", value = ConstraintMode.CONSTRAINT))
		private Place place;
		
		@ManyToOne
		@JoinColumn(name = "hosting_id",
				referencedColumnName = "hosting_id",
				foreignKey = @ForeignKey (name = "hosting_fk", value = ConstraintMode.CONSTRAINT))
		private Hosting hosting;
		
		@ManyToOne
		@JoinColumn(name = "tour_id",
				referencedColumnName = "tour_id",
				foreignKey = @ForeignKey (name = "tour_fk", value = ConstraintMode.CONSTRAINT))
		private Tour tour;
		
		@ManyToOne
		@JoinColumn(name = "ticket_id",
				referencedColumnName = "ticket_id",
				foreignKey = @ForeignKey (name = "ticket_fk", value = ConstraintMode.CONSTRAINT))
		private Ticket ticket;
		
		
		public Roteiro (RoteiroDTO roteiroDTO) {
			this.departionDate = roteiroDTO.getDepartionDate();
			this.peopleNumber = roteiroDTO.getPeopleNumber();
			this.finalPrice = roteiroDTO.getFinalPrice();
			this.place = roteiroDTO.getPlace();
			this.hosting = roteiroDTO.getHosting();
			this.tour = roteiroDTO.getTour();
			this.ticket = roteiroDTO.getTicket();
		}
		
		public Roteiro(Long id, String departionDate, int peopleNumber, BigDecimal finalPrice, Place place,
				Hosting hosting, Tour tour, Ticket ticket) {
			super();
			this.id = id;
			this.departionDate = departionDate;
			this.peopleNumber = peopleNumber;
			this.finalPrice = finalPrice;
			this.place = place;
			this.hosting = hosting;
			this.tour = tour;
			this.ticket = ticket;
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
