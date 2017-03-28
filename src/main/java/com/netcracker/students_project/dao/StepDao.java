package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.Step;
import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.IStepDao;

import java.util.List;

public class StepDao extends GenericDao<Step> implements IStepDao {

    @Override
    public List<User> findAllCheckedMentor() throws ExceptionDao {
        return null;
    }

    @Override
    public List<User> findAllUnCheckedMentor() throws ExceptionDao {
        return null;
    }
}
