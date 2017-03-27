package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.dao.interfaces.iEntityDao.ITaskDao;

import java.util.List;

public class TaskDao extends GenericDao<TaskEntity> implements ITaskDao {


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
