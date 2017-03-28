package com.netcracker.students_project.service;

import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.entity.*;
import org.hibernate.Session;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDB {
    private User userOwner;
    private Task task;
    private Tag teg;
    private User userMentor;
//    private Role roleOwner;
//    private Role roleMentor;
    Session session = Factory.getInstance().getUserDao().session;

    public void createUserOwner() {

        userOwner = new User();
        session.getTransaction().begin();
        //userOwner.setId(1);
        userOwner.setEmail("test6@gmail.com");
        userOwner.setNickname("testUs52");
        userOwner.setDtRegistration(new Date(1111, 11, 11));
        userOwner.setVkId(1);
        userOwner.setVkToken("1");
        session.persist(userOwner);
        session.flush();
        session.getTransaction().commit();
    }

    public void createTask() {
        Session session = Factory.getInstance().getTaskDao().session;
        task = new Task();
        session.getTransaction().begin();
       // task.setId(1);
        task.setDtCreated(new Date(Calendar.getInstance().getTimeInMillis()));
        task.setDescription("Hello Test CreateTask");
        task.setName("test name task");
        session.persist(task);
        session.flush();
        session.getTransaction().commit();
    }


//    public void createRoleOwner() {
//        roleOwner = new RoleE();
//
//        roleOwner.setName("owner");
//        session.getTransaction().begin();
//        session.persist(roleOwner);
//        session.getTransaction().commit();
//    }


    public void createAssignmentFirst() {
        session.getTransaction().begin();
        Assignment assignmentEntityOwner = new Assignment();
        assignmentEntityOwner.setUser(userOwner);
        assignmentEntityOwner.setRole("owner");
        assignmentEntityOwner.setTask(task);
        assignmentEntityOwner.setEmailNotification(true);
        session.persist(assignmentEntityOwner);

        session.getTransaction().commit();
    }

    Step[] stepEntity = new Step[3];
    public void createSteps() {
        int i;
        for (i = 0; i < 3; i++) {
            session.getTransaction().begin();
            Step steps=new Step();
            steps.setId(i);
            steps.setName("step test" + i);
            steps.setDescription("hello step");

//            File file = new File("resources/JustDoIT.jpg");
//            try {
//                stepEntity.setProofPhoto(Files.readAllBytes(file.toPath()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            long randomLong = Math.round((1 + Math.random()) * 259200000 * 5);
            steps.setDt_started(new Date(Calendar.getInstance().getTimeInMillis()));
            steps.setDeadline(new Date(timeInMillis));
            steps.setDt_finished(new Date(timeInMillis + randomLong / 2));
            steps.setTask(task);

            session.persist(steps);
            session.flush();
            session.getTransaction().commit();
            session.clear();
            stepEntity[i]=steps;
        }
    }
    public void createTeg() {
        session.getTransaction().begin();
        teg = new Tag();
        teg.setText("testTeg");
        session.save(teg);
        session.getTransaction().commit();
    }

//    public void createTaskTeg() {
//        session.getTransaction().begin();
//        TaskTag taskTegEntity = new TaskTegEntity();
//        taskTegEntity.setTaskId(task.getId());
//        taskTegEntity.setTegId(teg.getId());
//        session.persist(taskTegEntity);
//
//        session.getTransaction().commit();
//    }

    public void createUserMentor() {
        session.getTransaction().begin();
        userMentor = new User();
        userMentor.setEmail("mentor@gmail.com");
        userMentor.setNickname("testMentor");
        userMentor.setDtRegistration(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        userMentor.setVkId(2);
        userMentor.setVkToken("2");
        session.persist(userMentor);
        session.getTransaction().commit();
    }

//    public void createRoleMentor() {
//        session.getTransaction().begin();
//        roleMentor = new RoleEntity();
//        roleMentor.setId(2);
//        roleMentor.setName("mentor");
//        session.persist(roleMentor);
//        session.getTransaction().commit();
//    }

    public void createAssignmentMentor() {
        session.getTransaction().begin();
        Assignment assignmentEntity = new Assignment();
        assignmentEntity.setUser(userMentor);
        assignmentEntity.setTask(task);
        assignmentEntity.setRole("mentor");
        assignmentEntity.setEmailNotification(true);
        session.persist(assignmentEntity);
        session.getTransaction().commit();
    }

  public void createSubbmission() {
        session.getTransaction().begin();
        Submission submissionEntity = new Submission();
        submissionEntity.setId(1);
        submissionEntity.setResult(true);
        submissionEntity.setMentor(userMentor);
        submissionEntity.setStep(stepEntity[0]);
        session.persist(submissionEntity);
        session.getTransaction().commit();

        session.getTransaction().begin();
      submissionEntity = new Submission();
     // submissionEntity.setId(1);
      submissionEntity.setResult(true);
      submissionEntity.setMentor(userMentor);
      submissionEntity.setStep(stepEntity[1]);
        session.persist(submissionEntity);
        session.getTransaction().commit();

        session.getTransaction().begin();
      submissionEntity = new Submission();
     // submissionEntity.setId(1);
      submissionEntity.setResult(true);
      submissionEntity.setMentor(userMentor);
      submissionEntity.setStep(stepEntity[2]);
        session.persist(submissionEntity);
        session.getTransaction().commit();
    }


}
