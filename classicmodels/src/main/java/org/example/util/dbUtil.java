package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;


public class dbUtil {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private  static final String URL = "jdbc:mysql://localhost:3306/";
    private   static String USER_NAME = "root";
    private   static String PASSWORD = System.getenv().get("MYSQL_ROOT_PW");
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER_NAME, PASSWORD);
    }

}
