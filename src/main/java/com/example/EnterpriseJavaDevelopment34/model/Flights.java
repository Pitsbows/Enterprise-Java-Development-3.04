package com.example.EnterpriseJavaDevelopment34.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flights {
//    flight_number VARCHAR(255) NOT NULL,
//    aircraft VARCHAR(255),
//    flight_mileage INT,
//    PRIMARY KEY(flight_number),
//    FOREIGN KEY(aircraft) REFERENCES aircrafts(aircraft)

    @Id
    private String flightNumber;

    private String aircraft;
    private int flightMileage;

    public Flights() {
    }

    public Flights(String flightNumber, String aircraft, int flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.flightMileage = flightMileage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(int flightMileage) {
        this.flightMileage = flightMileage;
    }
}
