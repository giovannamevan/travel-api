package com.project.travel.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.travel.api.entities.Place;
import com.project.travel.api.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

		public List<Ticket> findByDestinationLocal (Place place);
}

