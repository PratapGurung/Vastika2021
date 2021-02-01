package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbUtil {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "Pg73597061995$$";
    public static final String SQL = "create database demo_db";


    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            //register the driver
            Class.forName(DRIVER);

            //obtain connection obect'
            con = DriverManager.getConnection(URL,USER_NAME, PASSWORD);

            //Obtain statement object
            st = con.createStatement();

            //excute query
            st.executeUpdate(SQL);


        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            try {
                con.close();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
