package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface ITaskDao{
    List<User> findAllMentor() throws ExceptionDao;
    List<Step> findAllStep() throws ExceptionDao;
    List<CommentTask> findAllComment() throws ExceptionDao;
    List<Tag> findAllTeg() throws ExceptionDao;
}

