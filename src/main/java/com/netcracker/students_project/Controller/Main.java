package com.netcracker.students_project.controller;

import com.netcracker.students_project.Service.TestDB;

public class Main {
    public static void main(String[] args) {
        TestDB testDB=new TestDB();
        testDB.createUserOwner();
//        testDB.createTask();
//        testDB.createRoleOwner();
//        testDB.createAssignmentFirst();
//        testDB.createSteps();
//        testDB.createTeg();
//        testDB.createTaskTeg();
    }
}
