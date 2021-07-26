package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Customers;
import com.example.EnterpriseJavaDevelopment34.model.Flights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightsRepositoryTest {

    @Autowired
    private FlightsRepository flightsRepository;

    private Flights flight1;
    private Flights flight2;
    private Flights flight3;
    private Flights flight4;
    private Flights flight5;

    @BeforeEach
    void setUp() {

        flight1 = new Flights("DL122", "Airbus A330", 4370);
        flight2 = new Flights("DL143", "Boeing 747", 135);
        flight3 = new Flights("DL53", "Boeing 777", 2078);
        flight4 = new Flights("DL37", "Boeing 747", 531);
        flight5 = new Flights("DL222", "Boeing 777", 1765);

        flightsRepository.save(flight1);
        flightsRepository.save(flight2);
        flightsRepository.save(flight3);
        flightsRepository.save(flight4);
        flightsRepository.save(flight5);

    }

    @AfterEach
    void tearDown()
    {
        flightsRepository.deleteAll();
    }


    @Test
    void test_findByStatus_existingflightNumber()
    {
        List<Flights> flightsList = flightsRepository.findByFlightNumber("DL222");
        assertEquals(1, flightsList.size());
    }

    @Test
    void test_findByflightMileageGreaterThan_existingflightMileage()
    {
        List<Flights> flightsList = flightsRepository.findByflightMileageGreaterThan(500);
        assertEquals(4, flightsList.size());
    }




}