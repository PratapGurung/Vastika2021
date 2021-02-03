package org.example.dao.customer;

import org.example.model.Customer;

import java.util.List;

public interface CustomerDao {
    int saveUser(Customer user);
    int updateUser(Customer user);
    int deleteUser(int id);
    Customer getUserById(int id);
    List<Customer> getAllUser();
}
