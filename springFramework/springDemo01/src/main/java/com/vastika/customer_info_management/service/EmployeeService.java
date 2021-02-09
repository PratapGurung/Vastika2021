package com.vastika.customer_info_management.service;

import com.vastika.customer_info_management.model.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee getEmployee(int id);
    List<Employee> getAllEmployee();
}
