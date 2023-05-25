package com.project.travel.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_tickets")
public class Ticket implements Serializable{
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String departionDate;
		
		
		@ManyToOne
		@JoinColumn(name = "place_id")
		@JsonBackReference
		private Place destinationLocal;
		private String originLocal;
		private BigDecimal ticketPrice;
		
		
		
}
