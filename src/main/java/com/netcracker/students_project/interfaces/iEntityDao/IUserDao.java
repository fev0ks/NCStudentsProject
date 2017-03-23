package com.netcracker.students_project.interfaces.iEntityDao;


import com.netcracker.students_project.entity.CommentsTaskEntity;
import com.netcracker.students_project.entity.TaskEntity;
import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface IUserDao {
    List<UserEntity> findAllUsers() throws ExceptionDao;
    List<TaskEntity>  findAllTask() throws ExceptionDao;
    List<TaskEntity>  findAllFinishedTask() throws ExceptionDao;
    List<TaskEntity>  findAllMentorTask() throws ExceptionDao;
    List<CommentsTaskEntity>  findAllComment() throws ExceptionDao;

}