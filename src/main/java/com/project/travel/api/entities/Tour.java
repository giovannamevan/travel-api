package com.project.travel.api.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_tours")
public class Tour {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String name;
		
		@ManyToOne
		@JoinColumn(name = "place_id",
		referencedColumnName = "place_id",
		foreignKey = @ForeignKey (name = "tour_place_fk", value = ConstraintMode.CONSTRAINT))
		private Place local;
		@Column(length = 800)
		private String description;
		private BigDecimal ticketPrice;
}
