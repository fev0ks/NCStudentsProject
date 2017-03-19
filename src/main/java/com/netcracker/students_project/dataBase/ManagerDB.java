package com.netcracker.students_project.dataBase;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ManagerDB {
    private static volatile ManagerDB instance;
    private ConnectorDB connectorDB;

    private ManagerDB() {
        connectorDB = new ConnectorDB();
    }

    public static ManagerDB getInstance() {
        if (instance == null)
            synchronized (ManagerDB.class) {
                if (instance == null)
                    instance = new ManagerDB();
            }
        return instance;
    }

    public void insertPeopleToDB(String name, int age) {
        String insertQuery = "insert into test_tb(name,age) values(?,?)";
        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Integer> getAllPeopleFromDB() {
        String selectQuery = "select * from test_db";
        HashMap<String, Integer> mapOfPeople = new HashMap<>();
        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(selectQuery)) {
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet != null && resultSet.next()) {
                mapOfPeople.put(resultSet.getString(1), resultSet.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mapOfPeople;
    }
//        private HashMap<String,Integer> getMapFromResultSet(ResultSet resultSet){
//
//        }
    // }

}
