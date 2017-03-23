package com.netcracker.students_project.dao;

import com.netcracker.students_project.dataBase.HibernateUtil;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;
import org.hibernate.Session;

public class AssignmentDao implements IDao<AssignmentDao> {
    @Override
    public void get(AssignmentDao entity) throws ExceptionDao {
        try (Session session = HibernateUtil.getSession()) {
            entity.get();
        }

    }

    @Override
    public AssignmentDao create(AssignmentDao entity) throws ExceptionDao {
        return null;
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
