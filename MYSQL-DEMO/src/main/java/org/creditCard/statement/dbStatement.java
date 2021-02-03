package org.creditCard.statement;

import org.creditCard.util.dbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class dbStatement {
    private String sql="";

    public dbStatement(String s){
        sql = s;
        try (
                Statement st = dbUtil.getConnection().createStatement();
                ){
            st.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException throwables ) {
            throwables.printStackTrace();
        }
    }



}
