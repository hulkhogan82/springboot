package com.example.springBoot.repository;

import com.example.springBoot.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FlightDepartureRepository extends JpaRepository<Flight, String> {

    List<Flight> findByDestinationCode(String destinationCode);

    Optional<Flight> findByFlightNumber(String flightNumber);
}