package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.dao.TaskDao;
import com.netcracker.students_project.entity.CommentsTaskEntity;
import com.netcracker.students_project.entity.StepEntity;
import com.netcracker.students_project.entity.TegEntity;
import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

import java.util.List;

interface ITaskDao extends IDao<TaskDao> {
    List<UserEntity> findAllMentor() throws ExceptionDao;
    List<StepEntity> findAllStep() throws ExceptionDao;
    List<CommentsTaskEntity> findAllComment() throws ExceptionDao;
    List<TegEntity> findAllTeg() throws ExceptionDao;
}

