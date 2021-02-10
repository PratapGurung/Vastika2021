package com.vastika.customer_info_management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeNumber;
    private String lasName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private int reportsTo;
   // @ManyToOne
   // private Role jobTitle;


}
