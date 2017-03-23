package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.StepEntity;
import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.IStepDao;

import java.util.List;

public class StepDao extends GenericDao<StepEntity> implements IStepDao {


    @Override
    public String toString(StepEntity entity) {
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
