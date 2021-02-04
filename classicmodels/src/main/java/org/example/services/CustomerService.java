package org.example.services;

import org.example.dao.customer.CustomerDao;
import org.example.dao.customer.CustomerDaoImpl;
import org.example.model.Customer;

import java.util.List;

public interface CustomerService {
    int saveCustomer(Customer customer);
    int updateCustomer(Customer customer);
    int deleteCustomer(int id);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomer();

}
