package org.creditCard.operations;

import org.creditCard.statement.dbStatement;

public class creditCardDb {

    public  void createDb(String query){
        dbStatement rs = new dbStatement(query);
    }

    public  void createTables(String query){
        dbStatement rs = new dbStatement(query);
    }

    public static void main(String[] args) {
        creditCardDb db = new creditCardDb();

        //create database
        //db.createDb("CREATE DATABASE IF NOT EXISTS credit_card; ");

        //create tables/

        String tableQuery = "use credit_card;" +
                            "create table if not exists credit_card_dataset" +
                            "(PersonID INTEGER not null," +
                            "Attrition_Flag varchar(255)," +
                            "Customer_age varchar(255)," +
                            "Gender varchar(255)," +
                            "Dependent_count varchar(255)," +
                            "Education_level varchar(255)," +
                            "Marital_Status varchar(255)," +
                            "Income_Category varchar(255)," +
                            "Card_Category varchar(255)," +
                            "Months_on_book varchar(255)," +
                            "Total_Relationship_Count varchar(255)," +
                            "Months_Inactive_12_mon varchar(255)," +
                            "Contacts_Count_12_mon varchar(255)," +
                            "Credit_Limit varchar(255)," +
                            "Total_Revolving_Bal varchar(255)," +
                            "Avg_Open_To_Buy varchar(255)," +
                            "Total_Amt_Chng_Q4_Q1 varchar(255)," +
                            "Total_Trans_Amt varchar(255)," +
                            "Total_Trans_Ct varchar(255)," +
                            "Total_Ct_Chng_Q4_Q1 varchar(255)," +
                            "Avg_Utilization_Ratio varchar(255));";

        db.createTables(tableQuery);
    }
}



