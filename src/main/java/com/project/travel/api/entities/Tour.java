package com.project.travel.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tb_tours")
public class Tour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "tour_id")
	private Long tourId;
	private String tourName;

	@ManyToOne
	@JoinColumn(name = "place_id", referencedColumnName = "place_id", foreignKey = @ForeignKey(name = "place_tr_fk", value = ConstraintMode.CONSTRAINT))
	@JsonBackReference
	private Place tourLocal;

	@Column(length = 800)
	private String description;
	private BigDecimal ticketPrice;

	public Long getTourId() {
		return tourId;
	}

	public void setTourId(Long tourId) {
		this.tourId = tourId;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public Place getTourLocal() {
		return tourLocal;
	}

	public void setTourLocal(Place tourLocal) {
		this.tourLocal = tourLocal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
