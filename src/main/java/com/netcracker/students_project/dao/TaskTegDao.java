package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.TaskTegEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

public class TaskTegDao implements IDao<TaskTegEntity>{
    @Override
    public void get(TaskTegEntity entity) throws ExceptionDao {

    }

    @Override
    public TaskTegEntity create(TaskTegEntity entity) throws ExceptionDao {
        return null;
    }

    @Override
    public void update(TaskTegEntity entity) throws ExceptionDao {

    }

    @Override
    public void delete(TaskTegEntity entity) throws ExceptionDao {

    }

    @Override
    public String toString(TaskTegEntity entity) {
        return null;
    }
}
