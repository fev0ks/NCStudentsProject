package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.TegEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

public class TegDao implements IDao<TegEntity>{
    @Override
    public void get(TegEntity entity) throws ExceptionDao {
        
    }

    @Override
    public TegEntity create(TegEntity entity) throws ExceptionDao {
        return null;
    }

    @Override
    public void update(TegEntity entity) throws ExceptionDao {

    }

    @Override
    public void delete(TegEntity entity) throws ExceptionDao {

    }

    @Override
    public String toString(TegEntity entity) {
        return null;
    }
}
