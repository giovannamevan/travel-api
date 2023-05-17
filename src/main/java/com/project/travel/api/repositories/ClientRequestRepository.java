package com.project.travel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.travel.api.entities.ClientRequest;

public interface ClientRequestRepository extends JpaRepository<ClientRequest, Long>{

}
