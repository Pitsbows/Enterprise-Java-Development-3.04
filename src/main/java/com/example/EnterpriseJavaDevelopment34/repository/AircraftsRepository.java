package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Aircrafts;
import com.example.EnterpriseJavaDevelopment34.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftsRepository extends JpaRepository<Aircrafts, String> {
    List<Aircrafts> findByAircraftLike(String aircraft);
}
