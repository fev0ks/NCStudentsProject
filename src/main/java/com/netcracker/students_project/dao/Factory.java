package com.netcracker.students_project.dao;


public class Factory {
    private static StudentDAO studentDAO = null;
    private static Factory instance;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public StudentDAO getStudentDAO() {
        if (studentDAO == null) {
            studentDAO = new StudentDAO();
        }
        return studentDAO;

    }
}
