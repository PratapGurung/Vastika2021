package com.vastika.customer_info_management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerNumber;
    private String customerName;
    private String phone;
    private String addressLine1;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String saleRepEmployeeNumber;
    private double creditLimit;
}
