package com.example.springBoot.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "DEPARTURES")
public class Flight extends AbstractPersistable<Integer> {

    @Id
    private String flightNumber;
    private String destination;
    private String destinationCode;
    private String airlineName;
    private String airlineCode;
    private LocalTime departureTime;
    private String terminal;
    private boolean codeShare;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }

    @Override
    public String toString() {
        return String.format(
                "Flight [destination=%s, destinationCode=%s, airlineName=%s, airlineCode=%s, flightNumber=%s, time=%s, terminal=%s, codeShare=%s]",
                destination, destinationCode, airlineName, airlineCode, flightNumber, departureTime, terminal, codeShare);
    }
}
