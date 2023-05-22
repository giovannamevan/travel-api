package com.project.travel.api.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_placesInfo")
public class Place {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String city;
		private String country;
		
		@OneToMany(mappedBy = "destinationLocal")
		private List<Ticket> tickets;
		
		@OneToMany(mappedBy = "local")
		private List<Hosting> hostings;
		
		@OneToMany(mappedBy = "local")
		private List<Tour> tours;
		
		
}
