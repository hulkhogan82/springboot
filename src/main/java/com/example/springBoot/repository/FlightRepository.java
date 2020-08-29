package com.example.springBoot.repository;

import com.example.springBoot.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    List<Flight> findByDestinationCode(String destinationCode);

    Optional<Flight> findByFlightNumber(String flightNumber);
}