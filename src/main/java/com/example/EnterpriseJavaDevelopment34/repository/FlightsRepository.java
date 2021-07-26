package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Customers;
import com.example.EnterpriseJavaDevelopment34.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, String> {
    List<Flights> findByFlightNumber(String flightNumber);
    List<Flights> findByflightMileageGreaterThan(int flightMileage);

}
