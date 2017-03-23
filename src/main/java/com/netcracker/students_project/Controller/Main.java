package com.netcracker.students_project.controller;

import com.netcracker.students_project.service.TestDB;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TestDB testDB=new TestDB();


//        try {
//            System.out.println("ПОЛУЧЕНО"+ Factory.getInstance().getUserDao().get(1));
//        } catch (ExceptionDao exceptionDao) {
//            exceptionDao.printStackTrace();
//        }
        testDB.createUserOwner();
        testDB.createTask();
        testDB.createRoleOwner();
        testDB.createAssignmentFirst();
        testDB.createSteps();
        testDB.createTeg();
        testDB.createTaskTeg();
        testDB.createUserMentor();
        testDB.createRoleMentor();
        testDB.createAssignmentMentor();
        testDB.createSubbmission();
    }
}
