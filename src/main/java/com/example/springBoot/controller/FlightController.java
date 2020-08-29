package com.example.springBoot.controller;

import com.example.springBoot.entity.Flight;
import com.example.springBoot.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/departures")
    public List<Flight> getAllFlights(){
        return flightService.getDepartures();
    }
    @GetMapping("/departures/{destinationCode}")
    public List<Flight> getFlightsDepartingTo(@PathVariable String destinationCode) {
        return flightService.getDeparturesByDestination(destinationCode);
    }

    @GetMapping("/departure/{flightNumber}")
    public Flight getFlightByFlightNumber(@PathVariable String flightNumber) {
        return flightService.getDepartureByFlightNumber(flightNumber);
    }
}
