package org.example.controller;

import org.example.enums.CustomerOptions;
import org.example.model.Customer;
import org.example.services.CustomerService;
import org.example.services.CustomerServiceImpl;
import org.example.view.customerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    private customerView custView;;
    private CustomerService customerService;

    CustomerController(){
        custView = new customerView();//create view
        custView.returnView();//display view
        customerService = new CustomerServiceImpl();


    }

    public void submit(){
        //button action listeners
        int option = custView.getOptions();

        if(option == CustomerOptions.SAVE.getValue()){
            //call save method to jdbc
            customerService.saveCustomer(getCustomer());
        }
        else if(option == CustomerOptions.UPDATE.getValue()){
            //call  update
            Customer customer = getCustomer();
            customer.setCustomerNumber(Integer.parseInt(custView.getId().getText()));
            customerService.updateCustomer(customer);
        }
        else if(option == CustomerOptions.DELETE.getValue()){
            System.out.println(option);

            showMsg("Customer Successfully Deleted!!! ");
        }
        else if(option == CustomerOptions.GET.getValue()){
            //call  get
            Customer customer = customerService.getCustomerById(Integer.parseInt(custView.getId().getText()));

        }
        else if(option == CustomerOptions.LIST.getValue()){
            //call  LIST
        }

    }

    private Customer getCustomer(){
        Customer customer = new Customer();
        customer.setCustomerName(custView.getCustomerName().getText());
        customer.setPhone(custView.getPhone().getText());
        customer.setAddressLine1(custView.getAddress().getText());
        customer.setCity(custView.getCity().getText());
        customer.setState(custView.getState().getText());
        customer.setPostalCode(custView.getZip().getText());
        customer.setCountry(custView.getCountry().getText());
        customer.setCreditLimit(Double.parseDouble(custView.getCredit_limit().getText()));
        return customer;
    }

    private void showMsg(String msg){
        JFrame frame;
        frame = new JFrame();
        frame.setTitle("CustomerView");
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(new JLabel(msg));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    private void showMsg(Customer customer){

    }
    public static void main(String[] args) {
        CustomerController cc = new CustomerController();


    }
}
