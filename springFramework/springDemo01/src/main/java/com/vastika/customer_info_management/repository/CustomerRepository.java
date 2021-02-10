package com.vastika.customer_info_management.repository;

import com.vastika.customer_info_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
        Customer findByUsername(String username);
}
