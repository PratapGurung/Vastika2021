package com.vastika.customer_info_management.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customer_number;
    private String customer_name;
    private String phone;
    private String address_line;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_of_birth;
    private String comments;
}
