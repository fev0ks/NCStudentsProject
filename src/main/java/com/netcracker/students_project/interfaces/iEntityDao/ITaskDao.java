package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface ITaskDao{
    List<UserEntity> findAllMentor() throws ExceptionDao;
    List<StepEntity> findAllStep() throws ExceptionDao;
    List<CommentsTaskEntity> findAllComment() throws ExceptionDao;
    List<TegEntity> findAllTeg() throws ExceptionDao;

}

