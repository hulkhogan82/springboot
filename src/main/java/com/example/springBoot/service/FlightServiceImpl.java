package com.example.springBoot.service;

import com.example.springBoot.entity.Flight;
import com.example.springBoot.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getDepartures() {
        return flightRepository.findAll();
    }

    public List<Flight> getDeparturesByDestination(String destinationCode) {
        return flightRepository.findByDestinationCode(destinationCode);
    }

    public Flight getDepartureByFlightNumber(String flightNumber) {
        return flightRepository.findByFlightNumber(flightNumber).orElse(null);
    }
}

