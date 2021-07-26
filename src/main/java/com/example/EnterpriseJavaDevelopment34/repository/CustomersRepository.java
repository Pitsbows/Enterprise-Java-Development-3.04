package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    List<Customers> findByName(String name);
    List<Customers> findByStatus(String status);
}
