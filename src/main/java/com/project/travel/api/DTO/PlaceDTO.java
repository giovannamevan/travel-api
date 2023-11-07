package com.project.travel.api.DTO;

import java.util.HashSet;
import java.util.Set;
import com.project.travel.api.entities.Tour;
import com.project.travel.api.entities.Hosting;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.Ticket;

public class PlaceDTO {
	private Long id;
	private String city;
	private String country;
	private Set<Ticket> tickets = new HashSet<>();
	private Set<Hosting> hostings = new HashSet<>();
	private Set<Tour> tours = new HashSet<>();

	public PlaceDTO() {

	}

	public PlaceDTO(Place entity) {
		this.id = entity.getId();
		this.city = entity.getCity();
		this.country = entity.getCountry();
		this.tickets = entity.getTickets();
		this.hostings = entity.getHostings();
		this.tours = entity.getTours();
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

}
