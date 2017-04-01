package ru.studentProject.dao;

public class DAOFactory {

    private static UserDaoImpl userDao = null;/*
    private static AssignmentDaoImpl assignmentDao = null;
    private static TaskDaoImpl taskDao = null;
    private static TagDaoImpl tagDao = null;*/

    private static DAOFactory instance;

    private DAOFactory() {
    }

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    /*public static AssignmentDaoImpl getAssignmentDao() {
        if(assignmentDao == null) {
            assignmentDao = new AssignmentDaoImpl();
        }
        return assignmentDao;
    }

    public static TaskDaoImpl getTaskDao() {
        if(taskDao == null) {
            taskDao = new TaskDaoImpl();
        }
        return taskDao;
    }

    public static TagDaoImpl getTagDao() {
        if(tagDao == null) {
            tagDao = new TagDaoImpl();
        }
        return tagDao;
    }*/

    public static UserDaoImpl getUseryDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }
}
