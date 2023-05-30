package com.project.travel.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name = "tb_tickets")
public class Ticket implements Serializable{
	private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "ticket_id")
		private Long ticketId;
		private String departionDate;
		
		@ManyToOne
		@JoinColumn(name = "place_id",
				referencedColumnName = "place_id",
				foreignKey = @ForeignKey (name = "place_t_fk", value = ConstraintMode.CONSTRAINT))
		@JsonBackReference
		private Place destinationLocal;
		private String originLocal;
		private BigDecimal ticketPrice;
		public Long getTicketId() {
			return ticketId;
		}
		public void setTicketId(Long ticketId) {
			this.ticketId = ticketId;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
}
