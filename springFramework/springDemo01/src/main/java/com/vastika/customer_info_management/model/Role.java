package com.vastika.customer_info_management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String roleName;


}
