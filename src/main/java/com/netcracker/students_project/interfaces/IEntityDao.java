package com.netcracker.students_project.interfaces;

import com.netcracker.students_project.dao.StepDao;
import com.netcracker.students_project.dao.TaskDao;
import com.netcracker.students_project.dao.UserDao;
import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

/**
 * Created by mixa1 on 23.03.2017.
 */
public class IEntityDao {

    interface IUserDao extends IDao<UserDao> {
        List<UserDao> findAllUsers() throws ExceptionDao;
        List<TaskEntity>  findAllTask() throws ExceptionDao;
        List<TaskEntity>  findAllFinishedTask() throws ExceptionDao;
        List<TaskEntity>  findAllMentorTask() throws ExceptionDao;
        List<CommentsTaskEntity>  findAllComment() throws ExceptionDao;
    }

    interface ITaskDao extends IDao<TaskDao> {
        List<UserEntity> findAllMentor() throws ExceptionDao;
        List<StepEntity> findAllStep() throws ExceptionDao;
        List<CommentsTaskEntity> findAllComment() throws ExceptionDao;
        List<TegEntity> findAllTeg() throws ExceptionDao;
    }

    interface IStepsDao extends IDao<StepDao>{
        List<UserEntity> findAllCheckedMentor() throws ExceptionDao;
        List<UserEntity> findAllUnCheckedMentor() throws ExceptionDao;
        StepDao findNearestDeadline() throws ExceptionDao;
    }
}
