package com.example.EnterpriseJavaDevelopment34.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aircrafts {
//    aircraft VARCHAR(255) NOT NULL,
//    total_aircraft_seats INT,
//    PRIMARY KEY(aircraft)

    @Id
    private String aircraft;

    private int totalAircraftSeats;


    public Aircrafts() {
    }

    public Aircrafts(String aircraft, int totalAircraftSeats) {
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(int totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }
}
