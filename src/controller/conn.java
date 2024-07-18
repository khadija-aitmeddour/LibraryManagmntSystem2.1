package controller;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class conn {
    private final static String URL = "jdbc:mysql://localhost:3306/library";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";
    

    public static PreparedStatement getConn(String query){
        PreparedStatement preparedStatement = null;
        try{
          Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
          preparedStatement = conn.prepareStatement(query);
       

        }catch(SQLException e){
            e.printStackTrace();
        }
        return preparedStatement;
    }

     public static int setStringValue(PreparedStatement preparedStatement, int index, String value){
        try{
        preparedStatement.setString(index, value);
        return 0;
        }catch(SQLException e){
            e.printStackTrace();
            return -2;
        }
     }
     public static int setIntValue(PreparedStatement preparedStatement, int index, int value){
        try{
        preparedStatement.setInt(index, value);
        return 0;
        }catch(SQLException e){
            e.printStackTrace();
            return -2;
        }
     }
     public static int setDoubleValue(PreparedStatement preparedStatement, int index, Double value){
        try{
        preparedStatement.setDouble(index, value);
        return 0;
        }catch(SQLException e){
            e.printStackTrace();
            return -2;
        }
     }
     public static ResultSet executeQuery(PreparedStatement preparedStatement){
        ResultSet resultSet = null;
        try{
        resultSet = preparedStatement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return resultSet;
     }
     public static int executeUpdate(PreparedStatement preparedStatement){
        try{
        preparedStatement.executeUpdate();
        return 0;
        }catch(SQLException e){
            e.printStackTrace();
            return -1;
        }
        
     }
     public static void closeStatmnt(PreparedStatement preparedStatement){
        try{
        preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
     }
     public static String getStringResultSet(ResultSet resultSet, String column){
        try{
           return resultSet.getString(column);
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
     }
     public static int getIntResultSet(ResultSet resultSet, String column){
        try{
           return resultSet.getInt(column);
        }catch(SQLException e){
            e.printStackTrace();
            return 0;
        }
     }
     
     public static double getDoubleResultSet(ResultSet resultSet, String column){
        try{
           return resultSet.getDouble(column);
        }catch(SQLException e){
            e.printStackTrace();
            return 0;
        }
     }
     public static boolean nextResultSet(ResultSet resultSet){
        boolean z = false;
        try{
           z = resultSet.next();
            
        }catch(SQLException e){
            e.printStackTrace();
           
            
        }
        return z;
     }


    
    
    public static String getDate(int delay)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.plusDays(delay));
    
    }
    
 }
    
    
