package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Aircrafts;
import com.example.EnterpriseJavaDevelopment34.model.Customers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftsRepositoryTest {


    @Autowired
    private AircraftsRepository aircraftsRepository;

    private Aircrafts aircraft1;
    private Aircrafts aircraft2;
    private Aircrafts aircraft3;

    @BeforeEach
    void setUp()
    {
        aircraft1 = new Aircrafts("Airbus A330", 236);
        aircraft2 = new Aircrafts("Boeing 747", 400);
        aircraft3 = new Aircrafts("Boeing 777", 264);

        aircraftsRepository.save(aircraft1);
        aircraftsRepository.save(aircraft2);
        aircraftsRepository.save(aircraft3);

    }

    @AfterEach
    void tearDown()
    {
        aircraftsRepository.deleteAll();
    }


    @Test
    void test_findByStatus_existingStatus()
    {
        List<Aircrafts> aircraftsList = aircraftsRepository.findByAircraftLike("Boeing%");
        assertEquals(2, aircraftsList.size());
    }


}