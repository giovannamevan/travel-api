package com.project.travel.api.entities;

import java.io.Serializable;

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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tb_hostings")
public class Hosting implements Serializable{
	private static final long serialVersionUID = 1L;

		
		@Id
		@Column(name = "hosting_id")
		private Long HostingId;
		private String hostingName;
		
		@ManyToOne
		@JoinColumn(name = "place_id",
				referencedColumnName = "place_id",
				foreignKey = @ForeignKey (name = "place_h_fk", value = ConstraintMode.CONSTRAINT))
		@JsonBackReference
		private Place hostingLocal;
		
		@Column(length = 800)
		private String description;
		private int dailyPrice;
		
		public Long getHostingId() {
			return HostingId;
		}
		public void setHostingId(Long hostingId) {
			HostingId = hostingId;
		}
		public String getHostingName() {
			return hostingName;
		}
		public void setHostingName(String hostingName) {
			this.hostingName = hostingName;
		}
		public Place getHostingLocal() {
			return hostingLocal;
		}
		public void setHostingLocal(Place hostingLocal) {
			this.hostingLocal = hostingLocal;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getDailyPrice() {
			return dailyPrice;
		}
		public void setDailyPrice(int dailyPrice) {
			this.dailyPrice = dailyPrice;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	
		
		
}
