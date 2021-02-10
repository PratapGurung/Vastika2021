package com.vastika.customer_info_management.repository;

import com.vastika.customer_info_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Employee findByJobTitle(Employee employee);
    //Employee findByEAndEmployeeNumber(Employee employee);

}
