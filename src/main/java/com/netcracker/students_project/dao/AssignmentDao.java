package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

public class AssignmentDao implements IDao<AssignmentDao> {
    @Override
    public void get(AssignmentDao entity) throws ExceptionDao {
            entity.get(entity);
    }

    @Override
    public AssignmentDao create(AssignmentDao entity) throws ExceptionDao {
        entity.create(entity);
        return entity;
    }

    @Override
    public void update(AssignmentDao entity) throws ExceptionDao {

    }

    @Override
    public void delete(AssignmentDao entity) throws ExceptionDao {

    }

    @Override
    public String toString(AssignmentDao entity) {
        return null;
    }
}
