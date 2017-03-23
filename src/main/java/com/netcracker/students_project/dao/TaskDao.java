package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.ITaskDao;

import java.util.List;

public class TaskDao implements ITaskDao {
    @Override
    public void get(TaskDao entity) throws ExceptionDao {
        
    }

    @Override
    public TaskDao create(TaskDao entity) throws ExceptionDao {
        return null;
    }

    @Override
    public void update(TaskDao entity) throws ExceptionDao {

    }

    @Override
    public void delete(TaskDao entity) throws ExceptionDao {

    }

    @Override
    public String toString(TaskDao entity) {
        return null;
    }

    @Override
    public List<UserEntity> findAllMentor() throws ExceptionDao {
        return null;
    }

    @Override
    public List<StepEntity> findAllStep() throws ExceptionDao {
        return null;
    }

    @Override
    public List<CommentsTaskEntity> findAllComment() throws ExceptionDao {
        return null;
    }

    @Override
    public List<TegEntity> findAllTeg() throws ExceptionDao {
        return null;
    }
}
