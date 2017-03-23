package com.netcracker.students_project.controller;

import com.netcracker.students_project.Service.TestDB;
import com.netcracker.students_project.dao.UserDao;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import org.springframework.transaction.annotation.Transactional;

public class Main {
    @Transactional
    public static void main(String[] args) {

        TestDB testDB=new TestDB();
       // testDB.createUserMentor();
        testDB.createUserOwner();
        UserDao userDao=new UserDao();
        try {
            System.out.println("ПОЛУЧЕНО"+userDao.get(1));
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
//        testDB.createTask();
//        testDB.createRoleOwner();
//        testDB.createAssignmentFirst();
//        testDB.createSteps();
//        testDB.createTeg();
//        testDB.createTaskTeg();
    }
}
