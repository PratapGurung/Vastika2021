package org.example.util;

public class QueryUtil {
    public static final String SAVE_SQl = "insert into user_table" +
            "(user_name,password,mobile_no,salary,enable,dbo)" +
            "values(?,?,?,?,?,?)";

    public static final String UPDATE_SQL = "update user_table" +
                "set user_name = ? ," +
                "password = ?," +
                "mobile_no = ?," +
                "salary = ?," +
                "enable= ?," +
                "dbo = ?" +
                "where id = ?";

    public static final String DELETE_SQL = "delete from user_table id = ?";
    public static final String USER_BY_ID_SQL = "select * from user_table";
    public static final String LIST_SQL = "select * from user_table";

}
