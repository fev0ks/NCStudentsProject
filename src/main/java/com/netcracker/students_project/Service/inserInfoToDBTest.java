//package com.netcracker.students_project.Service;
//
//
//import com.netcracker.students_project.entity.StepEntity;
//import com.netcracker.students_project.entity.TaskEntity;
//import com.netcracker.students_project.entity.UserEntity;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//public class inserInfoToDBTest {
//        UserEntity userEntity;
//        TaskEntity taskEntity;
//
//        public void createUser(){
//            userEntity  =  new UserEntity();
//            userEntity.setId(1);
//            userEntity.setEmail("test@gmail.com");
//            userEntity.setNickname("testUser");
//            userEntity.setDtRegistration(new Date(1111,11,11));
//            userEntity.setVkId(1);
//            userEntity.setVkToken("1");
//        }
//
//
//        public void createStep1(){
//            StepEntity stepEntity=new StepEntity();
//            stepEntity.setName("step test1");
//            stepEntity.setDescription("hello step");
//            File file= new File("resources/JustFoIT.jpg");
//            try {
//                stepEntity.setProofPhoto(Files.readAllBytes(file.toPath()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//            long date = Calendar.getInstance().getTimeInMillis();
//
//            stepEntity.setDtStarted(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
//            stepEntity.setDeadline(new java.sql.Date(date+518400000)); //+6 дня :(
//            stepEntity.setDtFinished(new java.sql.Date(date+259200000)); //+3 дня
//
//        }
//}
