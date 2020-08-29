package com.example.springBoot.service;

import com.example.springBoot.entity.Flight;

import java.util.List;

public interface FlightService {

    /**
     * Get all Flights departing today
     *
     * @return a List containing zero or more Flight objects
     */
    List<Flight> getDepartures();

    /**
     * Get all Flights departing to a particular destination
     *
     * @param destinationCode The 3-letter code of the destination of the flight
     * @return a List containing zero or more Flight objects
     */
    List<Flight> getDeparturesByDestination(String destinationCode);

    /**
     * Lookup a flight by its flight number
     *
     * @param flightNumber The flightNumber to retrieve
     * @return the flight for the given FlightNumber or null
     */
    Flight getDepartureByFlightNumber(String flightNumber);
}