package com.project.travel.api.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tickets")
public class Ticket {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String departionDate;
		
		@ManyToOne
		@JoinColumn(name = "place_id")
		private Place destinationLocal;
		private String originLocal;
		private BigDecimal ticketPrice;
		
}
