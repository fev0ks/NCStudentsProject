package com.netcracker.students_project.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

//@Configuration
//@EnableAutoConfiguration
////@PropertySource("classpath:application.properties")
//@ComponentScan
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
       // TestDB testDB=new TestDB();
//        try {
//            System.out.println("ПОЛУЧЕНО"+ Factory.getInstance().getUserDao().get(1));
//        } catch (ExceptionDao exceptionDao) {
//            exceptionDao.printStackTrace();
//        }
    //    testDB.createUserOwner();
//        testDB.createTask();
//        testDB.createRoleOwner();
//        testDB.createAssignmentFirst();
//        testDB.createSteps();
//        testDB.createTeg();
//        testDB.createTaskTeg();
//        testDB.createUserMentor();
//        testDB.createRoleMentor();
//        testDB.createAssignmentMentor();
//        testDB.createSubbmission();
    }
}
