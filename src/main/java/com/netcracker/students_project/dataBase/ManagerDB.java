package com.netcracker.students_project.dataBase;


import com.netcracker.students_project.Model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void insertPeopleToDB(Student student) {
        String insertQuery = "insert into test_tb(name,age,pass) values(?,?,?);";
        //System.out.println(name+"-"+age);
        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(insertQuery)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setInt(3, student.getPass());
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int getIdUser(Student student){
        String insertQuery = "select id from test_tb where name=? and pass=?";
        int id=0;
        //System.out.println(name+"-"+age);
        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(insertQuery)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getPass() );
            ResultSet resultSet=preparedStatement.executeQuery();
                if(resultSet!=null&&resultSet.next()){
                    id=(resultSet.getInt("id"));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    public List<Student> getAllPeopleFromDB() {
        String selectQuery = "select * from test_db;";
        List<Student> mapOfPeople = new ArrayList<>();
        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(selectQuery)) {
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet != null && resultSet.next()) {
                mapOfPeople.add(new Student(resultSet.getString(1), resultSet.getInt(2)));
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
