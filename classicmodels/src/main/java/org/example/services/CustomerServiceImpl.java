package org.example.services;

import org.example.dao.customer.CustomerDao;
import org.example.dao.customer.CustomerDaoImpl;
import org.example.model.Customer;

import java.util.List;

public class CustomerServiceImpl  implements CustomerService{
    CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public int saveCustomer(Customer customer) {
        return customerDao.saveCustomer(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public int deleteCustomer(int id) {
        return customerDao.deleteCustomer(id);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }
}
