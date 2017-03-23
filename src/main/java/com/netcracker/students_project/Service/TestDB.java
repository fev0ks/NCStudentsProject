package com.netcracker.students_project.Service;

import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import org.hibernate.Session;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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


    public void createUserOwner() {

        userOwner = new UserEntity();
        Session session = Factory.getInstance().getUserDao().session;

        session.getTransaction().begin();
        userOwner.setId(2);
        userOwner.setEmail("test2@gmail.com");
        userOwner.setNickname("testUser2");
        userOwner.setDtRegistration(new Date(1111, 11, 11));
        userOwner.setVkId(2);
        userOwner.setVkToken("2");
        session.persist(userOwner);

        System.out.println(userOwner.toString());
        session.flush();
        session.getTransaction().commit();

    }


    public void createTask() {
        taskEntity = new TaskEntity();
        taskEntity.setId(1);
        taskEntity.setDtCreated(new Date(Calendar.getInstance().getTimeInMillis()));
        taskEntity.setDescription("Hello Test CreateTask");
        taskEntity.setName("test name task");

        try {
             Factory.getInstance().getTaskDao().create(taskEntity);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }


    public void createRoleOwner() {
        roleOwner = new RoleEntity();
        roleOwner.setId(1);
        roleOwner.setName("owner");

        try {
             Factory.getInstance().getRoleDao().create(roleOwner);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }


    public void createAssignmentFirst() {
        AssignmentEntity assignmentEntityOwner = new AssignmentEntity();
        assignmentEntityOwner.setUserId(userOwner.getId());
        assignmentEntityOwner.setTaskId(taskEntity.getId());
        // assignmentEntityOwner.setRoleEntity(roleOwner);
        assignmentEntityOwner.setEmailNotification(true);

        try {
             Factory.getInstance().getAssignmentDao().create(assignmentEntityOwner);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }


    public void createSteps() {

        int i;
        for (i = 0; i < 3; i++) {
            StepEntity stepEntity = new StepEntity();
            stepEntity.setName("step test" + i);
            stepEntity.setDescription("hello step");
            File file = new File("resources/JustDoIT.jpg");
            try {
                stepEntity.setProofPhoto(Files.readAllBytes(file.toPath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            long randomLong = Math.round((1 + Math.random()) * 259200000 * 5);
            stepEntity.setDtStarted(new Date(Calendar.getInstance().getTimeInMillis()));
            stepEntity.setDeadline(new Date(timeInMillis));
            stepEntity.setDtFinished(new Date(timeInMillis + randomLong / 2));
            // stepEntity.setTaskEntity(taskEntity);

            try {
                 Factory.getInstance().getStepDao().create(stepEntity);
            } catch (ExceptionDao exceptionDao) {
                exceptionDao.printStackTrace();
            }
        }
    }

    public void createTeg() {
        tegEntity = new TegEntity();
        tegEntity.setText("testTeg");

        try {
             Factory.getInstance().getTegDao().create(tegEntity);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }

    public void createTaskTeg() {
        TaskTegEntity taskTegEntity = new TaskTegEntity();
        //taskTegEntity.setTaskEntity(taskEntity);
        //taskTegEntity.setTegEntity(tegEntity);

        try {
             Factory.getInstance().getTaskTegsDao().create(taskTegEntity);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }

    public void createUserMentor() {
        userMentor = new UserEntity();
        userMentor.setId(2);
        userMentor.setEmail("mentor@gmail.com");
        userMentor.setNickname("testMentor");
        userMentor.setDtRegistration(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        userMentor.setVkId(2);
        userMentor.setVkToken("2");

        try {
             Factory.getInstance().getUserDao().create(userMentor);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();

        }

    }

    public void createRoleMentor() {
        roleMentor = new RoleEntity();
        roleMentor.setId(2);
        roleMentor.setName("mentor");

        try {
            Factory.getInstance().getRoleDao().create(roleMentor);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();

        }

    }

    public void createAssignment() {
        AssignmentEntity assignmentEntity = new AssignmentEntity();
        assignmentEntity.setUserId(userMentor.getId());
        assignmentEntity.setTaskId(taskEntity.getId());
        //  assignmentEntity.setRoleEntity(roleMentor);
        assignmentEntity.setEmailNotification(true);

        try {
            Factory.getInstance().getAssignmentDao().create(assignmentEntity);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();

        }

    }

    void createSubbmission() {
        SubmissionEntity submissionEntity = new SubmissionEntity();
        submissionEntity.setId(1);
        submissionEntity.setResult(true);
        //   submissionEntity.setUserEntity(userMentor);
        //  submissionEntity.setStepEntity(new StepEntity());
        try {
             Factory.getInstance().getSubmissionDao().create(submissionEntity);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
    }
}
