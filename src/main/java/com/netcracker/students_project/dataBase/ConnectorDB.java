//package com.netcracker.students_project.dataBase;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//public class ConnectorDB {
//
//    private Connection connection;
//
//    public ConnectorDB() {
//        try {
//            Class.forName("org.postgresql.Driver");
//            String URL = "jdbc:postgresql://localhost:5433/test_db";
//            String USERNAME = "postgres";
//            String PASSWORD = "root";
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("Where is your MySQL JDBC Driver?");
//            e.printStackTrace();
//        }
////        catch (ClassNotFoundException e) {
////    }
//    }
//
//    public Connection getConnection() {
//        return connection;
//    }
//}
