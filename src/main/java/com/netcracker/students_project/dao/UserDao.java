package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.*;

import java.util.List;

public class UserDao implements IStepDao{
    @Override
    public void get(StepDao entity) throws ExceptionDao {

    }

    @Override
    public StepDao create(StepDao entity) throws ExceptionDao {
        return null;
    }

    @Override
    public void update(StepDao entity) throws ExceptionDao {

    }

    @Override
    public void delete(StepDao entity) throws ExceptionDao {

    }

    @Override
    public String toString(StepDao entity) {
        return null;
    }

    @Override
    public List<UserEntity> findAllCheckedMentor() throws ExceptionDao {
        return null;
    }

    @Override
    public List<UserEntity> findAllUnCheckedMentor() throws ExceptionDao {
        return null;
    }
}
