package com.vastika.customer_info_management.service;

import com.vastika.customer_info_management.model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    Customer getCustomer(int id);
    List<Customer> getAllCustomer();
}
