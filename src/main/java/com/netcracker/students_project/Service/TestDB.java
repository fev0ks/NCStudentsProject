package com.netcracker.students_project.service;

import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.dataBase.HibernateUtil;
import com.netcracker.students_project.entity.*;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDB {
    private UserEntity userOwner;
    private TaskEntity taskEntity;
    private TegEntity tegEntity;
    private UserEntity userMentor;
    private RoleEntity roleOwner;
    private RoleEntity roleMentor;
    Session session = Factory.getInstance().getUserDao().session;

  @Transactional
    public void createUserOwner() {
    session=HibernateUtil.getSessionFactory().openSession();

        userOwner = new UserEntity();
       // session.getTransaction().begin();
        //userOwner.setId(1);
        userOwner.setEmail("tests26q@gmail.com");
        userOwner.setNickname("testUs52");
        userOwner.setDtRegistration(new Date(1111, 11, 11));
        userOwner.setVkId(1);
        userOwner.setVkToken("1");
        session.persist(userOwner);
       session.flush();
//        session.getTransaction().commit();
    }

    public void createTask() {
        Session session = Factory.getInstance().getTaskDao().session;
        taskEntity = new TaskEntity();
        session.getTransaction().begin();
       // taskEntity.setId(1);
        taskEntity.setDtCreated(new Date(Calendar.getInstance().getTimeInMillis()));
        taskEntity.setDescription("Hello Test CreateTask");
        taskEntity.setName("test name task");
        session.persist(taskEntity);
        session.flush();
        session.getTransaction().commit();
    }


    public void createRoleOwner() {
        roleOwner = new RoleEntity();

        roleOwner.setName("owner");
        session.getTransaction().begin();
        session.persist(roleOwner);
        session.getTransaction().commit();
    }

@Transactional
    public void createAssignmentFirst() {
        session.getTransaction().begin();
        AssignmentEntity assignmentEntityOwner = new AssignmentEntity();
        assignmentEntityOwner.setUserId(userOwner.getId());
        assignmentEntityOwner.setRoleEntity(roleOwner);
        assignmentEntityOwner.setTaskId(taskEntity.getId());
        assignmentEntityOwner.setEmailNotification(true);
        session.persist(assignmentEntityOwner);

        session.getTransaction().commit();
    }

    StepEntity[] stepEntity = new StepEntity[3];
    public void createSteps() {
        int i;
        for (i = 0; i < 3; i++) {
            session.getTransaction().begin();
            StepEntity steps=new StepEntity();
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
            steps.setDtStarted(new Date(Calendar.getInstance().getTimeInMillis()));
            steps.setDeadline(new Date(timeInMillis));
            steps.setDtFinished(new Date(timeInMillis + randomLong / 2));
            steps.setTaskEntity(taskEntity);

            session.persist(steps);
            session.flush();
            session.getTransaction().commit();
            session.clear();
            stepEntity[i]=steps;
        }
    }
    public void createTeg() {
        session.getTransaction().begin();
        tegEntity = new TegEntity();
        tegEntity.setText("testTeg");
        session.persist(tegEntity);
        session.getTransaction().commit();
    }

    public void createTaskTeg() {
        session.getTransaction().begin();
        TaskTegEntity taskTegEntity = new TaskTegEntity();
        taskTegEntity.setTaskId(taskEntity.getId());
        taskTegEntity.setTegId(tegEntity.getId());
        session.persist(taskTegEntity);

        session.getTransaction().commit();
    }

    public void createUserMentor() {
        session.getTransaction().begin();
        userMentor = new UserEntity();
        userMentor.setEmail("mentor@gmail.com");
        userMentor.setNickname("testMentor");
        userMentor.setDtRegistration(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        userMentor.setVkId(2);
        userMentor.setVkToken("2");
        session.persist(userMentor);
        session.getTransaction().commit();
    }

    public void createRoleMentor() {
        session.getTransaction().begin();
        roleMentor = new RoleEntity();
        roleMentor.setId(2);
        roleMentor.setName("mentor");
        session.persist(roleMentor);
        session.getTransaction().commit();
    }

    public void createAssignmentMentor() {
        session.getTransaction().begin();
        AssignmentEntity assignmentEntity = new AssignmentEntity();
        assignmentEntity.setUserId(userMentor.getId());
        assignmentEntity.setTaskId(taskEntity.getId());
        assignmentEntity.setRoleEntity(roleMentor);
        assignmentEntity.setEmailNotification(true);
        session.persist(assignmentEntity);
        session.getTransaction().commit();
    }

  public void createSubbmission() {
        session.getTransaction().begin();
        SubmissionEntity submissionEntity = new SubmissionEntity();
        submissionEntity.setId(1);
        submissionEntity.setResult(true);
        submissionEntity.setUserEntity(userMentor);
        submissionEntity.setStepEntity(stepEntity[0]);
        session.persist(submissionEntity);
        session.getTransaction().commit();
        session.getTransaction().begin();

        submissionEntity = new SubmissionEntity();
        submissionEntity.setId(2);
        submissionEntity.setResult(true);
        submissionEntity.setUserEntity(userMentor);
        submissionEntity.setStepEntity(stepEntity[1]);
        session.persist(submissionEntity);
        session.getTransaction().commit();

        session.getTransaction().begin();
        submissionEntity = new SubmissionEntity();
        submissionEntity.setId(3);
        submissionEntity.setResult(false);
        submissionEntity.setUserEntity(userMentor);
        submissionEntity.setStepEntity(stepEntity[2]);
        session.persist(submissionEntity);
        session.getTransaction().commit();
    }


}
