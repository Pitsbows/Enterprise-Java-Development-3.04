package com.example.EnterpriseJavaDevelopment34.model;


import javax.persistence.*;

@Entity
public class Customers {
//    id INT NOT NULL AUTO_INCREMENT,
//    customer_name VARCHAR(255),
//    customer_status VARCHAR(255),
//    total_customer_mileage INT,
//    PRIMARY KEY(id)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // = AUTO_INCREMENT
    private int id;

    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_status")
    private String status;
    @Column(name = "total_customer_mileage")
    private int mileage;

    public Customers() {
    }

    public Customers(String name, String status, int mileage) {
        this.name = name;
        this.status = status;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
