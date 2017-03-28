package com.netcracker.students_project.interfaces.iEntityDao;


import com.netcracker.students_project.entity.CommentTask;
import com.netcracker.students_project.entity.Task;
import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface IUserDao {
    List<User> findAllUsers() throws ExceptionDao;
    List<Task>  findAllTask() throws ExceptionDao;
    List<Task>  findAllFinishedTask() throws ExceptionDao;
    List<Task>  findAllMentorTask() throws ExceptionDao;
    List<CommentTask>  findAllComment() throws ExceptionDao;

}