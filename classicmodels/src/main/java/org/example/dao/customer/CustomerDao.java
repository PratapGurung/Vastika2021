package org.example.dao.customer;

import org.example.model.Customer;

import java.util.List;

public interface CustomerDao {
    int saveCustomer(Customer user);
    int updateCustomer(Customer user);
    int deleteCustomer(int id);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomer();
}
