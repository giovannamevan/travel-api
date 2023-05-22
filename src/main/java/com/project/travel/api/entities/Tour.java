package com.project.travel.api.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tours")
public class Tour {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String name;
		
		@ManyToOne
		@JoinColumn(name = "place_id")
		private Place local;
		@Column(length = 800)
		private String description;
		private BigDecimal ticketPrice;
}
