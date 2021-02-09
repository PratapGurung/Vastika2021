package com.vastika.customer_info_management.controller;

import com.vastika.customer_info_management.model.Customer;
import com.vastika.customer_info_management.model.Employee;
import com.vastika.customer_info_management.service.EmployeeService;
import com.vastika.customer_info_management.service.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;
    public  EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/add_employee")
    public String getEmployeeForm(){
        return "addEmployee";
    }

    @GetMapping("/edit_employee")
    public String getEditEmployeeForm(@RequestParam int id, Model model){
        model.addAttribute("employee", employeeService.getEmployee(id));
        return "editEmployee";
    }

    @PostMapping("/save_employee")
    public String saveCustomer(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/list_employee";
    }

    @PostMapping("/update_employee")
    public String updateCustomer(@ModelAttribute Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/list_employee";
    }

    @GetMapping("/list_employee")
    public String getAllCustomer(Model model){
        model.addAttribute("employees", employeeService.getAllEmployee());
        return "listEmployee";
    }
    @GetMapping("/delete_employee")
    public String deleteCustomer(@RequestParam int id){
        employeeService.deleteEmployee(id);
        return "redirect:/list_employee";
    }
}
