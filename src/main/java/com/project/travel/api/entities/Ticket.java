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
@Data
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
		
		
		
}
