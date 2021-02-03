package org.example.dao.customer;

import org.example.model.Customer;
import org.example.util.dbUtil;
import org.example.util.queryUtil;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{

    @Override
    public int saveUser(Customer customer) {
        int saved = 0;
        try(PreparedStatement ps = userAction(customer,queryUtil.SAVE_SQl);) {
            saved =  ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return saved;
    }

    @Override
    public int updateUser(Customer customer) {
        int updated = 0;
        try(PreparedStatement ps = userAction(customer,queryUtil.UPDATE_SQL);) {
            ps.setInt(13,customer.getCustomerNumber());
            updated =  ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updated;
    }

    @Override
    public int deleteUser(int id) {
        int deleted = 0;
        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(queryUtil.DELETE_SQL);
        ){
            ps.setInt(1,id);
            deleted = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deleted;
    }

    @Override
    public Customer getUserById(int id) {

        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(queryUtil.CUSTOMER_BY_ID_SQL);
        ){
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Customer customer = createCustomer(rs);
                return customer;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Customer> getAllUser() {
        List<Customer> userlist = new ArrayList<>();

        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(queryUtil.LIST_SQL);
        ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Customer customer = createCustomer(rs);
                userlist.add(customer);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return userlist;
    }

    private static PreparedStatement userAction(Customer customer, String sql){
        try(
                PreparedStatement ps = dbUtil.getConnection().prepareStatement(sql);
        ){
            ps.setString(1,customer.getCustomerName());
            ps.setString(2,customer.getContactFirstName());
            ps.setString(3,customer.getContactLastName());
            ps.setString(4,customer.getPhone());
            ps.setString(5,customer.getAddressLine1());
            ps.setString(6,customer.getAddressLine2());
            ps.setString(7,customer.getCity());
            ps.setString(8,customer.getState());
            ps.setString(9,customer.getPostalCode());
            ps.setString(10,customer.getCountry());
            ps.setString(11,customer.getSaleRepEmployeeNumber());
            ps.setDouble(12,customer.getCreditLimit());
            return ps;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Customer createCustomer(ResultSet rs){
        Customer customer = new Customer();
        try {
            customer.setCustomerNumber(rs.getInt("customerNumber"));
            customer.setCustomerName(rs.getString("customerName"));
            customer.setContactFirstName(rs.getString("contactFirstName"));
            customer.setContactLastName(rs.getString("contactLastName"));
            customer.setPhone(rs.getString("phone"));
            customer.setAddressLine1(rs.getString("addressLine1"));
            customer.setAddressLine2(rs.getString("addressLine2"));
            customer.setCity(rs.getString("city"));
            customer.setState(rs.getString("state"));
            customer.setPostalCode(rs.getString("postalCode"));
            customer.setCountry(rs.getString("country"));
            customer.setSaleRepEmployeeNumber(rs.getString("salesRepEmployeeNumber"));
            customer.setCreditLimit(rs.getDouble("creditLimit"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }
}
