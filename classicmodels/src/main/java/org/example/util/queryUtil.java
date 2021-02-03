package org.example.util;

public class queryUtil {
    public static final String SAVE_SQl = "insert into customers(" +
            "customerName,contactLastName,contactFirstName,phone,addressLine1," +
            "addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit)" +
            "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_SQL = "update customers set" +
            "customerName = ?," +
            "contactLastName = ?," +
            "contactFirstName = ?," +
            "phone = ?," +
            "addressLine1 = ?," +
            "addressLine2 = ?," +
            "city = ?," +
            "state = ?," +
            "postalCode = ?," +
            "country = ?," +
            "salesRepEmployeeNumber = ?," +
            "creditLimit = ? where id = ?";

    public static final String DELETE_SQL = "delete from customers where id = ?";
    public static final String CUSTOMER_BY_ID_SQL = "select * from customers where id = ?";
    public static final String LIST_SQL = "select * from customers";
}
