package com.netcracker.students_project.interfaces.iEntityDao;


import com.netcracker.students_project.dao.UserDao;
import com.netcracker.students_project.entity.CommentsTaskEntity;
import com.netcracker.students_project.entity.TaskEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

import java.util.List;

interface IUserDao extends IDao<UserDao> {
    List<UserDao> findAllUsers() throws ExceptionDao;
    List<TaskEntity>  findAllTask() throws ExceptionDao;
    List<TaskEntity>  findAllFinishedTask() throws ExceptionDao;
    List<TaskEntity>  findAllMentorTask() throws ExceptionDao;
    List<CommentsTaskEntity>  findAllComment() throws ExceptionDao;
}