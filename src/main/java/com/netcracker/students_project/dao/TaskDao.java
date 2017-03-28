package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.*;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.ITaskDao;

import java.util.List;

public class TaskDao extends GenericDao<Task> implements ITaskDao {


    @Override
    public List<User> findAllMentor() throws ExceptionDao {
        return null;
    }

    @Override
    public List<Step> findAllStep() throws ExceptionDao {
        return null;
    }

    @Override
    public List<CommentTask> findAllComment() throws ExceptionDao {
        return null;
    }

    @Override
    public List<Tag> findAllTeg() throws ExceptionDao {
        return null;
    }
}
