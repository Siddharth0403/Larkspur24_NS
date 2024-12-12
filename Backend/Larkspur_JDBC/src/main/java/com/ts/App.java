package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String db_url = "jdbc:mysql://localhost/larkspur";
       String db_user = "root";
       String db_pwd = "root";
       
       
       Connection connection=DriverManager.getConnection(db_url, db_user, db_pwd);
       Statement statement= connection.createStatement();
       
     ResultSet rs  = statement.executeQuery("SELECT * FROM STUDENT");
     
      while (rs.next()) {
    	  String str = rs.getString("address");
    	  System.out.println(str);
    	  
      }
      
      connection.close();
       
       
    }
}
