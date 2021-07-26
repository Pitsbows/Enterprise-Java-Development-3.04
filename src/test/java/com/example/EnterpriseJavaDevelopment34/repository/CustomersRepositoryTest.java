package com.example.EnterpriseJavaDevelopment34.repository;

import com.example.EnterpriseJavaDevelopment34.model.Customers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomersRepositoryTest {

    @Autowired
    private CustomersRepository customersRepository;

    private Customers customer1;
    private Customers customer2;
    private Customers customer3;
    private Customers customer4;
    private Customers customer5;
    private Customers customer6;
    private Customers customer7;
    private Customers customer8;

    @BeforeEach
    void setUp() {
        customer1 = new Customers("Agustine Riviera", "Silver", 115235);
        customer2 = new Customers("Alaina Sepulvida", "None", 6008);
        customer3 = new Customers("Agustine Riviera", "Silver", 115235);
        customer4 = new Customers("Sam Rio",    "None",    2653);
        customer5 = new Customers("Jessica James", "Silver", 127656);
        customer6 = new Customers("Ana Janco", "Silver",    136773);
        customer7 = new Customers("Jennifer Cortez",    "Gold", 300582);
        customer8 = new Customers("Christian Janco", "Silver", 14642);

        customersRepository.save(customer1);
        customersRepository.save(customer2);
        customersRepository.save(customer3);
        customersRepository.save(customer4);
        customersRepository.save(customer5);
        customersRepository.save(customer6);
        customersRepository.save(customer7);
        customersRepository.save(customer8);

    }

    @AfterEach
    void tearDown()
    {
        customersRepository.deleteAll();
    }

    @Test
    void test_findByName_existingName()
    {
        List<Customers> customersList = customersRepository.findByName("Agustine Riviera");
        assertEquals(2, customersList.size());
    }

    @Test
    void test_findByStatus_existingStatus()
    {
        List<Customers> customersList = customersRepository.findByStatus("Silver");
        assertEquals(5, customersList.size());
    }


}