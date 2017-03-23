package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.RoleEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

public class RoleDao implements IDao<RoleEntity> {
    @Override
    public void get(RoleEntity entity) throws ExceptionDao {

    }

    @Override
    public RoleEntity create(RoleEntity entity) throws ExceptionDao {
        return null;
    }

    @Override
    public void update(RoleEntity entity) throws ExceptionDao {

    }

    @Override
    public void delete(RoleEntity entity) throws ExceptionDao {

    }

    @Override
    public String toString(RoleEntity entity) {
        return null;
    }
}
