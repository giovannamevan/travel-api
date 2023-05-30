package com.project.travel.api.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;


@Entity
@Table(name = "tb_places")
public class Place implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "place_id")
		private Long id;
		private String city;
		private String country;
		
		@OneToMany(mappedBy = "hostingLocal", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
		@JsonManagedReference
		private Set<Hosting> hostings = new HashSet<>();
		
		@OneToMany(mappedBy = "destinationLocal", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
		@JsonManagedReference
		private Set<Ticket> tickets = new HashSet<>();
		
		
		@OneToMany(mappedBy = "tourLocal", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
		@JsonManagedReference
		private Set<Tour> tours = new HashSet<>();
		
		public Place () {
			
		}

		public Place(Long id, String city, String country, Set<Ticket> tickets, Set<Hosting> hostings,
				Set<Tour> tours) {
			
			this.id = id;
			this.city = city;
			this.country = country;
			this.tickets = tickets;
			this.hostings = hostings;
			this.tours = tours;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Set<Ticket> getTickets() {
			return tickets;
		}

		public void setTickets(Set<Ticket> tickets) {
			this.tickets = tickets;
		}

		public Set<Hosting> getHostings() {
			return hostings;
		}

		public void setHostings(Set<Hosting> hostings) {
			this.hostings = hostings;
		}

		public Set<Tour> getTours() {
			return tours;
		}

		public void setTours(Set<Tour> tours) {
			this.tours = tours;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
	
		
		
}
